package br.com.mrt.cliente.application.api;

import br.com.mrt.cliente.application.service.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

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
}
