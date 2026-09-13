package br.com.mrt.cliente.application.service;

import br.com.mrt.cliente.application.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ClienteAplicationService implements ClienteService {

        private final ClienteRepository clienteRepository;
}
