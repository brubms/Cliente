# 🏢 Cliente API — Gestão de Clientes

API RESTful desenvolvida com **Java 17** e **Spring Boot**, aplicando princípios de **Arquitetura em Camadas Desacopladas (Ports & Adapters)**, validações de domínio com Bean Validation, imutabilidade com DTOs e persistência relacional com **MySQL 8**.

---

## 🛠️ Tecnologias e Ferramentas

- **Linguagem:** Java 17 (LTS)
- **Framework:** Spring Boot (Spring Web MVC, Spring Data JPA, Bean Validation)
- **Banco de Dados:** MySQL 8
- **Produtividade & Logs:** Lombok (`@RequiredArgsConstructor`, `@Log4j2`)
- **Gerenciador de Dependências:** Apache Maven
- **Versionamento:** Git (Git Flow com branches de feature e Pull Requests)

---

## 🏛️ Arquitetura e Estrutura de Pacotes

O projeto adota uma arquitetura em camadas desacopladas orientada a casos de uso:

```text
src/main/java/br/com/mrt/cliente/
├── application/
│   ├── api/                     # Camada Web / REST
│   │   ├── ClienteAPI           # Contrato da API (Endpoints e Mapeamento HTTP)
│   │   ├── ClienteRestController# Controlador REST (Recepção, Validação e Delegação)
│   │   └── *DTOs                # ClienteRequest, ClienteResponse, ClienteListResponse, ClienteDetalhadoResponse
│   ├── repository/              # Portas de Saída (Contratos de Acesso a Dados)
│   │   └── ClienteRepository    # Interface desacoplada da infraestrutura
│   └── service/                 # Camada de Aplicação / Regras de Negócio
│       ├── ClienteService       # Contrato de Caso de Uso
│       └── ClienteApplicationService # Implementação da regra de negócio
├── domain/                      # Núcleo de Domínio
│   └── Cliente                  # Entidade rica com identificador único UUID
└── infra/                       # Adaptadores de Infraestrutura
    ├── ClienteInfraRepository   # Implementação concreta do repositório
    └── ClienteSpringDataJpaRepository # Interface Spring Data JPA
```

---

## 🚀 Endpoints da API

### Base URL: `/cliente`

| Método | Endpoint | Descrição | Status HTTP |
| :--- | :--- | :--- | :--- |
| **POST** | `/cliente` | Cadastra um novo cliente | `201 Created` |
| **GET** | `/cliente` | Lista todos os clientes cadastrados | `200 OK` |
| **GET** | `/cliente/{idCliente}` | Busca os detalhes de um cliente por ID (UUID) | `200 OK` |

---

## 📋 Exemplos de Requisição e Resposta

### 1. Cadastrar Cliente (`POST /cliente`)
**Payload de Entrada:**
```json
{
  "nomeCompleto": "Bruno Martins",
  "email": "bruno@email.com",
  "celular": "71999998888",
  "cpf": "12345678901",
  "dataNascimento": "1995-05-20",
  "aceitaTermos": true
}
```

**Resposta (`201 Created`):**
```json
{
  "idCliente": "a3bb189e-8bf9-4566-9e16-981c2f94b8e2"
}
```

---

### 2. Listar Clientes (`GET /cliente`)
**Resposta (`200 OK`):**
```json
[
  {
    "idCliente": "a3bb189e-8bf9-4566-9e16-981c2f94b8e2",
    "nomeCompleto": "Bruno Martins",
    "cpf": "12345678901"
  }
]
```

---

### 3. Buscar Cliente por ID (`GET /cliente/{idCliente}`)
**Resposta (`200 OK`):**
```json
{
  "idCliente": "a3bb189e-8bf9-4566-9e16-981c2f94b8e2",
  "nomeCompleto": "Bruno Martins",
  "email": "bruno@email.com",
  "celular": "71999998888",
  "cpf": "12345678901",
  "dataNascimento": "1995-05-20",
  "dataHoraDoCadastro": "2026-10-07T20:30:00"
}
```

---

## ⚙️ Como Executar o Projeto Localmente

### Pré-requisitos
- JDK 17 instalado
- MySQL 8 em execução (porta 3306)
- Git e Maven

### 1. Clonar o repositório
```bash
git clone https://github.com/brubms/Cliente.git
cd Cliente
```

### 2. Configurar o Banco de Dados
No arquivo `src/main/resources/application.properties`, ajuste suas credenciais do MySQL:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/cliente_db?createDatabaseIfNotExist=true&serverTimezone=UTC
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

### 3. Executar a Aplicação
```bash
./mvnw spring-boot:run
```
A API estará disponível em: `http://localhost:8080/cliente`

---

## 👤 Autor

Desenvolvido por **Bruno Martins**  
- [LinkedIn](https://www.linkedin.com/in/bruno-bernardo-soares-martins-590721160/)
- [GitHub](https://github.com/brubms)
