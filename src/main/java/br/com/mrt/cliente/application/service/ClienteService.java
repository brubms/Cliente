package br.com.mrt.cliente.application.service;

import br.com.mrt.cliente.application.api.ClienteRequest;
import br.com.mrt.cliente.application.api.ClienteResponse;

public interface ClienteService {
    ClienteResponse cadastraNovoCliente(ClienteRequest clienteRquest);
}
