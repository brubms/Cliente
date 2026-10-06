# Pull Request Checklist — NOME BRANCH/FEATURE

## Objetivo

DESCRIÇÃO FUNÇÃO

---

## Regra de Negócio - De acordo com a implementação

- [x] DE ACORDO COM O BACKLOG DO JIRA
- [x] DE ACORDO COM O BACKLOG DO JIRA
- [x] DE ACORDO COM O BACKLOG DO JIRA


---

## Endpoint - De acordo com a implementação

```http
POST /mrtech/v1/contratante/
```

---

## Query Params - De acordo com a implementação

- `idMusico (Path Variable)`
- `DisponibilidadeRequest (Request Body)`

---

## Arquivos Alterados - De acordo com a implementação

- [ ] ContratanteAPI
- [ ] ContratanteRestController
- [ ] ContratanteService
- [ ] ContratanteApplicationService
- [ ] ContratanteRepository
- [ ] ContratanteInfraRepository
- [ ] ContratanteJPARepository
- [ ] Contratante (Domain)
---

## Arquivos Criados - De acordo com a implementação

- [ ] ContranteRequest (exemplo - apagar caso não se aplique)
- [ ] ContratanteListResponse (exemplo - apagar caso não se aplique)

---

## Testes Realizados - De acordo com a implementação

- [x] informe testes realizados
- [x] informe testes realizados
- [x] informe testes realizados
- [x] informe testes realizados
- [x] informe testes realizados

---



## Observações - De acordo com a implementação

- altere aqui

- altere aqui


---
## Validação Arquitetural (Fixo)

- [x] **Originalidade:** Mantém o padrão arquitetural core do projeto (API-Controller-Service-Repo-infra).
- [x] **Consistência:** Nomenclatura e estrutura de pastas seguem o padrão estabelecido.
- [x] **Higiene:** Uso estrito de DTOs para entrada/saída, mantendo a integridade da Entity.
- [x] **Logs:** Padronização de logs mantida para rastreabilidade consistente.

## Status do PR

- [x] Atualizado no Jira
- [x] Testado localmente
- [x] Pronto para revisão
- [x] Pronto para merge
- [x] Compete função - quando algum outro metodo utiliza parametros de reutilização da função
- [x] Compete função - quando algum outro metodo c parametros de reutilização da função