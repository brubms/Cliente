package br.com.mrt.cliente.infra;


import br.com.mrt.cliente.application.repository.ClienteRepository;
import br.com.mrt.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Log4j2
public class ClienteInfraRepository implements ClienteRepository {

    private final ClienteSpringDataJpaRepository jpaRepository;

    @Override
    public Cliente salva(Cliente cliente){
        log.info("[inicia] ClienteInfraRepository - salva");

        log.info("[finaliza] ClienteInfraRepository - salva");
        return null;
    }
}
