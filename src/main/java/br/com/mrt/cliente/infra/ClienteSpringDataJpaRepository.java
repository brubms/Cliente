package br.com.mrt.cliente.infra;

import br.com.mrt.cliente.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteSpringDataJpaRepository extends JpaRepository<Cliente, UUID> {
}
