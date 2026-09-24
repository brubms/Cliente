package br.com.mrt.cliente.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mrt.cliente.domain.Cliente;

/*
*Ela está completamente vazia! Como ela consegue 
*salvar com .save(cliente) e buscar com .findAll()?

*O Spring Data JPA olha para o extends JpaRepository<Cliente, UUID>.
*Por baixo dos panos, o Spring contrata EntityManager 
*Quando você chama jpaRepository.save(cliente), o Spring roda um em.persist(cliente).
*Quando você chama jpaRepository.findAll(), o Spring roda um em.createQuery("from Cliente").
*/
public interface ClienteSpringDataJpaRepository extends JpaRepository<Cliente, UUID> {

}
