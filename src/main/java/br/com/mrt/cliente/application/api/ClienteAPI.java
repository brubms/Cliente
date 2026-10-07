package br.com.mrt.cliente.application.api;


import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RequestMapping("/cliente") //define que todas as rotas desse API começam com /v1/cliente
//contrato da rota
public interface ClienteAPI {
    //mapeia a chamada para o verbo HTTP POST
    @PostMapping
    //Devolve o código HTTP 201 (Created)
    @ResponseStatus(HttpStatus.CREATED)
    /*
    *@RequestBody @Valid: Pega o JSON enviado no corpo da requisição e valida os dados de entrada.
    * */
    ClienteResponse postCadastraNovoCliente(@RequestBody @Valid ClienteRequest clienteRequest);
    //------------------------------------------------------------------------------------------
    //mapeia a rota para o verbo http GET
    @GetMapping("/{idCliente}")
    //devolve o status 200 ok , caso seja processada com sucesso a listagem
    @ResponseStatus(HttpStatus.OK)
    //No contrato, temos um retorno do tipo List que retorna uma listagem em java
    List<ClienteListResponse> getListaTodosClientes();//<- métododo contrato
    //-----------------------------------------------------------------------------------------
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    ClienteDetalhadoResponse getBuscaClientePorId(@PathVariable UUID idCliente);
}
