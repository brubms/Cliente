package br.com.mrt.cliente.domain;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

@Entity(name = "cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private UUID idCliente;
	@NotNull
	@NotBlank
	@Size(min = 10)
	private String nomeCompleto;
	@CPF
	private String cpf;
	@NotNull
	@NotBlank
	private String email;
	@Size(min = 11 , max = 13)
	private int telefone;
	@NotNull
	@NotBlank
	private LocalDate dataNascimento;
	private LocalDate dataHoraCadastro;
	private LocalDate dataHoraAtualizacao;
	private boolean ativo = true;

}
