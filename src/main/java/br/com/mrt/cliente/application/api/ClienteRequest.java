package br.com.mrt.cliente.application.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
/*
* O que é o ClienteRequest?
*Ele é o DTO (Data Transfer Object) que vai receber o JSON que o usuário manda quando quer se cadastrar.
*/
public class ClienteRequest {

    private String nomeCompleto;
    @CPF
    private String cpf;
    @NotNull
    @NotBlank
    private String email;
    @Size(min = 10, max = 13)
    private String telefone;
    @NotNull
    private LocalDate dataNascimento;
}
