package br.com.mrt.cliente.application.api;

import br.com.mrt.cliente.domain.Cliente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteListResponse {

    private UUID idCliente;
    private String nomeCompleto;
    private String email;

    public ClienteListResponse (Cliente cliente){
        this.idCliente = cliente.getIdCliente();
        this.nomeCompleto = cliente.getNomeCompleto();
        this.email = cliente.getEmail();
    }

    public static List<ClienteListResponse> converte(List<Cliente> clientes){
        return null;
    }
}
