package br.com.mrt.cliente.application.api;

import br.com.mrt.cliente.application.service.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@Log4j2
public class ClienteRestController implements ClienteAPI{

    private final ClienteService clienteService;

    @Override
    public ClienteResponse postCadastraNovoCliente(@Valid ClienteRequest clienteRequest){
        log.info("[incia] ClienteRestController - postCadastraNovoCliente");
        ClienteResponse cliente = clienteService.cadastraNovoCliente(clienteRequest);
        log.info("[finaliza] ClienteRestController - postCadastraNovoCliente");
        return cliente;
    }
    @Override
    public List<ClienteListResponse> getListaTodosClientes(){
        log.info("[inicia] ClienteRestController - getListaTodosClientes");
        List<ClienteListResponse> listaCliente = clienteService.listaTodosClientes();
        log.info("[finaliza] ClienteRestController - getListaTodosClientes");
        return listaCliente;
    }

    @Override
    public ClienteDetalhadoResponse getBuscaClientePorId(UUID idCliente){
        log.info("[inicia] ClienteRestController - getBuscaClientePorId");
        ClienteDetalhadoResponse detalhado = clienteService.buscaClientePorId(idCliente);
        log.info("[finaliza] ClienteRestController - getBuscaClientePorId");
        return detalhado;
    }

    @Override
    public void patchAlteraDadosCliente(UUID idCliente, ClienteAlteradoRequest clienteAlteradoRequest ){
        log.info("[inicia] ClienteRestController - patchAlteraDadosCliente");

        log.info("[finaliza] ClienteRestController - patchAlteraDadosCliente");
    }
}
