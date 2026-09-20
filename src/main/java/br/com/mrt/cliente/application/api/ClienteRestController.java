package br.com.mrt.cliente.application.api;

import br.com.mrt.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;
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
}
