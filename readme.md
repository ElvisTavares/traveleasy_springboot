# API Básica de Viagens - Spring Boot
Este é um projeto de API básica para gerenciamento de viagens.

## Descrição
A API permite que os usuários realizem operações CRUD (Create, Read, Update, Delete) em viagens, incluindo a criação, listagem, atualização e exclusão de viagens.

### Recursos
- Criação de viagens
- Listagem de viagens

### Endpoints
__Listar todas as viagens:__
GET
```
/travel
```
Retorna todas as viagens cadastradas.

__Salvar uma viagem:__
POST
```
/travel
```
Cria uma nova viagem com os dados fornecidos.

__Listar uma viagem pelo id:__

```
/travel/{id}
```
Retorna todas as viagens cadastradas.

__Listar as viagens que fazem parte de uma lista específica:__
```
/lists/{id}/travels
```
Onde o id é o id da lista. ex: lista 1 viagens nacionais

### Instalação
1. Clone o repositório
2. Utilizar a ferramenta springtools ou intellij para rodar o projeto

### Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir um pull request ou relatar problemas.

### Licença
Este projeto está licenciado sob a MIT License.

Espero que este exemplo seja útil para você!