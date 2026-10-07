package br.com.mrt.cliente.application.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteListResponse {

    private UUID idCliente;
    private String nomeCompleto;
    private String email;
}
