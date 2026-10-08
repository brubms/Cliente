package br.com.mrt.cliente.application.service;

import br.com.mrt.cliente.application.api.ClienteDetalhadoResponse;
import br.com.mrt.cliente.application.api.ClienteListResponse;
import br.com.mrt.cliente.application.api.ClienteRequest;
import br.com.mrt.cliente.application.api.ClienteResponse;

import java.util.List;
import java.util.UUID;

public interface ClienteService {
    ClienteResponse cadastraNovoCliente(ClienteRequest clienteRequest);

    List<ClienteListResponse> listaTodosClientes();

    ClienteDetalhadoResponse buscaClientePorId(UUID idCliente);
}
