package br.com.mrt.cliente.domain;

import br.com.mrt.cliente.application.api.ClienteAlteradoRequest;
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
import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(unique = true, nullable = false)
    private UUID idCliente;
    @NotBlank
    @NotNull
    @Size(min = 10)
    private String nomeCompleto;
    @CPF
    private String cpf;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    @NotNull
    @NotBlank
    private String email;
    @Size(min = 10,max = 13)
    private String telefone;
    @NotNull
    @Size(min = 10,max = 13)
    private String celular;
    @NotNull
    private LocalDate dataNascimento;
    private LocalDateTime dataHoraCadastro;
    private LocalDateTime dataHoraAtualizado;
    private boolean ativo = true;

    public Cliente(ClienteRequest clienteRequest){
        this.nomeCompleto = clienteRequest.getNomeCompleto();
        this.cpf = clienteRequest.getCpf();
        this.email = clienteRequest.getEmail();
        this.telefone = clienteRequest.getTelefone();
        this.dataNascimento = clienteRequest.getDataNascimento();
        this.dataHoraCadastro = LocalDateTime.now();
        this.celular = clienteRequest.getCelular();
        this.sexo = clienteRequest.getSexo();

    }

    public void alteraCliente(ClienteAlteradoRequest clienteAlteradoRequest) {
        this.email = clienteAlteradoRequest.getEmail();
        this.telefone = clienteAlteradoRequest.getTelefone();
        this.celular = clienteAlteradoRequest.getCelular();
        this.dataHoraAtualizado = LocalDateTime.now();
    }
}
