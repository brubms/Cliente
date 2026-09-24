package br.com.mrt.cliente.application.repository;

import br.com.mrt.cliente.domain.Cliente;
import java.util.List;
public interface ClienteRepository {


    Cliente salva(Cliente cliente);
     List<Cliente> buscaTodosClientes();
}
