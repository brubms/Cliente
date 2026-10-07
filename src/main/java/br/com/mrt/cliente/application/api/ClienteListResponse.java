package br.com.mrt.cliente.application.api;

import br.com.mrt.cliente.domain.Cliente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
//já cria os getters e os contrutores necessario para o Spring
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteListResponse {

    //traz apenas o que é necessario e não expoe dados importantes
    private UUID idCliente;
    private String nomeCompleto;
    private String email;

    public ClienteListResponse (Cliente cliente){
        this.idCliente = cliente.getIdCliente();
        this.nomeCompleto = cliente.getNomeCompleto();
        this.email = cliente.getEmail();
    }
    //estatico para a chamada poder ser feita pelo nome do método na classe
    //sem precisar instanciar um objeto antes
    public static List<ClienteListResponse> converte(List<Cliente> clientes){
        return clientes.stream()
                //Para cada Cliente na lista, ele executa o construtor acima (new ClienteListResponse(cliente)),
                // transformando a entidade em DTO.
                .map(ClienteListResponse::new)
                //Coleta todos os DTOs transformados e fecha dentro de uma nova lista.
                .collect(Collectors.toList());
    }
}
