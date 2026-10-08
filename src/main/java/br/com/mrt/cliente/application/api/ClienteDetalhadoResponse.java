package br.com.mrt.cliente.application.api;

import br.com.mrt.cliente.domain.Cliente;
import br.com.mrt.cliente.domain.Sexo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDetalhadoResponse {

    private String nomeCompleto;
    private Sexo sexo;
    private String cpf;
    private String email;
    private String telefone;
    private String celular;
    private LocalDate dataNascimento;
    private LocalDateTime dataHoraCadastro;
    private LocalDateTime dataHoraAtualizacao;

    public ClienteDetalhadoResponse(Cliente cliente){
        this.nomeCompleto = cliente.getNomeCompleto();
        this.sexo = cliente.getSexo();
        this.cpf = cliente.getCpf();
        this.email = cliente.getEmail();
        this.telefone = cliente.getTelefone();
        this.dataNascimento = cliente.getDataNascimento();
        this.dataHoraCadastro = cliente.getDataHoraCadastro();
        this.dataHoraAtualizacao = cliente.getDataHoraAtualizado();
        this.celular = cliente.getCelular();
    }
}
