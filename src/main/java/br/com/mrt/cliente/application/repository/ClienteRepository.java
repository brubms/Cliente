package br.com.mrt.cliente.application.repository;

import br.com.mrt.cliente.domain.Cliente;

import java.util.List;
import java.util.UUID;

public interface ClienteRepository {

    Cliente salva(Cliente cliente);

    List<Cliente> buscarTodosClientes();

    Cliente buscaPorId(UUID idCliente);
}
