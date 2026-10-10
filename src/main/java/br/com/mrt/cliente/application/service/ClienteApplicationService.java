package br.com.mrt.cliente.application.service;

import br.com.mrt.cliente.application.api.*;
import br.com.mrt.cliente.application.repository.ClienteRepository;
import br.com.mrt.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Log4j2
public class ClienteApplicationService implements ClienteService{

    private final ClienteRepository clienteRepository;

    @Override
    public ClienteResponse cadastraNovoCliente(ClienteRequest clienteRequest){
        log.info("[inicia] ClienteApplicationService - cadastraNovoCliente");
        Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
        log.info("[finaliza] ClienteApplicationService - cadastraNovoCliente");
        return ClienteResponse.builder().idCliente(cliente.getIdCliente()).build();

    }

    @Override
    public List<ClienteListResponse> listaTodosClientes(){
        log.info("[inicia] ClienteApplicationService - listaTodosClientes");
        List<Cliente> clientes = clienteRepository.buscarTodosClientes();
        log.info("[finaliza] ClienteApplicationService - listaTodosClientes");
        return ClienteListResponse.converte(clientes);
        /*
        * O Service NUNCA devolve a lista bruta de Cliente para o Controller!
        *Em vez disso, ele passa essa lista pelo método estático de conversão: ClienteListResponse.converte(clientes).
        *Ali, a esteira do Java Stream entra em ação, transforma cada Cliente em um ClienteListResponse e devolve a lista refinada para o Controller!
        *
        *
        * */
    }
    @Override
    public ClienteDetalhadoResponse buscaClientePorId(UUID idCliente){
        log.info("[inicia] ClienteApplicationService - buscaClientePorId ");
        Cliente cliente = clienteRepository.buscaPorId(idCliente);
        log.info("[finaliza] ClienteApplicationService - buscaClientePorId ");
        return new ClienteDetalhadoResponse(cliente);
    }

    @Override
    public void alteraDadosCliente(UUID idCliente, ClienteAlteradoRequest clienteAlteradoRequest) {
        log.info("[inicia] ClienteApplicationService - alteraDadosCliente");
        Cliente cliente = clienteRepository.buscaPorId(idCliente);
        cliente.alteraCliente(clienteAlteradoRequest);
        clienteRepository.salva(cliente);
        log.info("[finaliza] ClienteApplicationService - alteraDadosCliente");

    }
}
