package br.com.mrt.cliente.application.api;


/*
* O que é o ClienteRequest?
*Ele é o DTO (Data Transfer Object) que vai receber o JSON que o usuário manda quando quer se cadastrar.
*/
public class ClienteRequest {

    private String nomeCompleto;
    private String email;
}
