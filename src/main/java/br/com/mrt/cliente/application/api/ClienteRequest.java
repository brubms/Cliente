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
public class ClienteRequest {

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
}
