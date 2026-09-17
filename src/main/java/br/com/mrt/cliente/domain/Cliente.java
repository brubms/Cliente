package br.com.mrt.cliente.domain;

import br.com.mrt.cliente.application.api.ClienteRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.util.UUID;
//cria a tabela chamada cliente;
@Entity(name = "cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
	//definindo a chave primaria (PK - PRIMARY KEY)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//cria uma coluna com informações únicas
	@Column(unique = true, nullable = false)
	private UUID idCliente;
	//colunas não aceitam ficar vazias
	@NotNull
	@NotBlank
	//tamaanho do nome completo
	@Size(min = 10)
	private String nomeCompleto;
	@CPF
	private String cpf;
	//colunas não aceitam ficar vazias
	@NotNull
	@NotBlank
	private String email;
	//tamanho do telefone
	@Size(min = 11 , max = 13)
	private String telefone;
	//colunas não aceitam ficar vazias
	@NotNull
	private LocalDate dataNascimento;
	private LocalDate dataHoraCadastro;
	private LocalDate dataHoraAtualizacao;
	// padrão será iniciado como true
	private boolean ativo = true;

	public Cliente(ClienteRequest clienteRequest) {
		this.nomeCompleto = clienteRequest.getNomeCompleto();
		this.cpf = clienteRequest.getCpf();
		this.email = clienteRequest.getEmail();
		this.telefone = clienteRequest.getTelefone();
		this.dataNascimento = clienteRequest.getDataNascimento();
		this.dataHoraCadastro = LocalDate.now();

	}


}
