package br.com.mrt.cliente.application.service;

import br.com.mrt.cliente.application.api.ClienteRequest;
import br.com.mrt.cliente.application.api.ClienteResponse;

import br.com.mrt.cliente.application.api.ClienteListResponse;

import java.util.List;
public interface ClienteService {
    ClienteResponse cadastraNovoCliente(ClienteRequest clienteRequest);
    List<ClienteListResponse> listaTodosClientes();
}
