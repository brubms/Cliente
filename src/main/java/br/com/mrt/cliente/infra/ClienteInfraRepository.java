package br.com.mrt.cliente.infra;


import br.com.mrt.cliente.application.repository.ClienteRepository;
import br.com.mrt.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
@Log4j2
public class ClienteInfraRepository implements ClienteRepository {

    private final ClienteSpringDataJpaRepository jpaRepository;

    @Override
    public Cliente salva(Cliente cliente){
        log.info("[inicia] ClienteInfraRepository - salva");
        Cliente salvaCliente = jpaRepository.save(cliente);
        log.info("[finaliza] ClienteInfraRepository - salva");
        return salvaCliente;
    }

    @Override
    public List<Cliente> buscarTodosClientes(){
        log.info("[inicia] ClienteInfraRepository - buscaTodosClientes");
        List<Cliente>  clientes = jpaRepository.findAll();
        log.info("[finaliza] ClienteInfraRepository - buscaTodosClientes");
        return clientes;
    }

    @Override
    public Cliente buscaPorId(UUID idCliente) {
        log.info("[inicia] ClienteInfraRepository - buscarPorId");
        Cliente cliente = jpaRepository.findById(idCliente).orElseThrow();
        log.info("[finaliza] ClienteInfraRepository - buscarPorId");
        return cliente;
    }



}
