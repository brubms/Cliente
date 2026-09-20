package br.com.mrt.cliente.application.service;

import br.com.mrt.cliente.application.api.ClienteRequest;
import br.com.mrt.cliente.application.api.ClienteResponse;
import br.com.mrt.cliente.application.repository.ClienteRepository;
import br.com.mrt.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class ClienteAplicationService implements ClienteService {

        private final ClienteRepository clienteRepository;


        @Override
        public ClienteResponse cadastraNovoCliente(ClienteRequest clienteRequest) {

                log.info("[Inicia] ClienteAplicationService - cadastraNovoCliente");
                Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
                log.info("[finaliza] CleinteAplicationService - cadastraNovoCliente");
                return ClienteResponse.builder().idCliente(cliente.getIdCliente()).build();
        }
}


