package br.com.mrt.cliente.application.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteAlteradoRequest {
    private String email;
    private String telefone;
    private String celular;
}
