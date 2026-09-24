package br.com.mrt.cliente.application.api;

import br.com.mrt.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequiredArgsConstructor
@Log4j2
public class ClienteRestController implements ClienteAPI{

    private final ClienteService clienteService;


    @Override
    public ClienteResponse postCadastroNovoCliente(ClienteRequest clienteRequest) {
        log.info("[Inicial] ClienteRestController - postCadastroNovoCliente");
        ClienteResponse cliente = clienteService.cadastraNovoCliente(clienteRequest);
        log.info("[finalizar] ClienteRestController - postCadastroNovoCliente");
        return cliente;
    }

     @Override 
    public List<ClienteListResponse> getListaTodosClientes() {
        log.info("[inicia] ClienteRestController - getListaTodosClientes");
        List<ClienteListResponse> clientes = clienteService.listaTodosClientes();
        log.info("[finaliza] ClienteRestController - getListaTodosClientes");
        return clientes;
    }
}
