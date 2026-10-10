package br.com.mrt.cliente.application.service;

import br.com.mrt.cliente.application.api.*;

import java.util.List;
import java.util.UUID;

public interface ClienteService {
    ClienteResponse cadastraNovoCliente(ClienteRequest clienteRequest);

    List<ClienteListResponse> listaTodosClientes();

    ClienteDetalhadoResponse buscaClientePorId(UUID idCliente);

    void alteraDadosCliente(UUID idCliente, ClienteAlteradoRequest clienteAlteradoRequest);
}
