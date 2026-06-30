# 🖥️ Sistema PDV (Ponto de Venda) - API REST

Projeto backend desenvolvido com **Java e Spring Boot**, com foco na construção de uma API REST para gerenciamento de produtos em um sistema de Ponto de Venda (PDV), com persistência em banco de dados relacional.

A aplicação implementa operações completas de CRUD para produtos, com uso de DTOs, validações de dados, arquitetura em camadas e configuração de ambientes distintos de execução.

---

# 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- DTOs (Data Transfer Objects)
- SpringDoc OpenAPI (Swagger)
- Maven
- MySQL
- MariaDB
- Postman

---

  ## 🧠 Arquitetura do Projeto

O projeto segue uma arquitetura em camadas baseada no ecossistema Spring Boot, com separação clara de responsabilidades:

```
dev.sistemapdv
│
├── controllers → Exposição da API e tratamento de requisições HTTP  
│   └── ProdutoController
│
├── services → Regras de negócio da aplicação  
│   └── ProdutoService
│
├── repositories → Acesso a dados via Spring Data JPA  
│   └── ProdutoRepository
│
├── entities → Mapeamento das entidades do banco de dados  
│   └── Produto
│
├── dtos → Objetos de transferência de dados (DTOs)  
│   └── ProdutoDTO
│
├── exceptions → Definição de exceções customizadas  
│   └── ProdutoNaoEncontradoException
│
└── handler → Tratamento global de erros e padronização de respostas  
    └── ExceptionHandlers
```

---

### 🎯 Objetivo da Arquitetura

- Baixo acoplamento entre camadas
- Melhor organização e legibilidade do código
- Facilidade de manutenção e escalabilidade
- Uso de DTOs para controle de entrada e saída de dados
- Padronização no tratamento de erros

---

# 🗄️ Banco de Dados e Configuração de Ambientes (Spring Profiles)

O projeto utiliza Spring Profiles para alternar entre ambientes sem necessidade de alteração no código-fonte.

### Perfis disponíveis

| Método | Endpoint                     |
|--------|------------------------------|
| Home   | MariaDB local (casa)         |
| Curso  | MySQL (ambiente do curso técnico) |

## Arquivos de configuração

- `application.properties`
- `application-home.properties`
- `application-curso.properties`

### Estratégia adotada

O arquivo `application.properties` define o profile ativo, permitindo alternância entre ambientes.

Credenciais sensíveis são gerenciadas via variáveis de ambiente:

```properties
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASSWORD}

```

---

# 📦 Funcionalidades da API
- Cadastro de produtos
- Consulta de produtos (geral e por ID)
- Atualização de produtos
- Remoção de produtos
- Organização de dados via DTOs

---

# 📌 Validações e Regras

A aplicação implementa validações para garantir a integridade dos dados, evitando registros com campos nulos, inconsistentes ou inválidos.

Além disso, segue uma arquitetura padrão baseada em separação de responsabilidades e uso de DTOs para controle de entrada e saída de dados.

---

# 🔧 Testes da API

Toda a API foi testada utilizando **Postman**, permitindo validação visual e funcional de todas as operações CRUD.
lém disso, foi utilizada a interface do **Swagger (SpringDoc OpenAPI)** para documentar a API e realizar testes rápidos dos endpoints diretamente pelo navegador.

---

# 🎯 Objetivos do Projeto
- Construir uma API REST com Spring Boot
- Aplicar arquitetura em camadas
- Praticar persistência com banco de dados relacional
- Utilizar múltiplos ambientes com Spring Profiles
- Utilizar DTOs para melhor controle de dados
- Documentar APIs utilizando Swagger (OpenAPI)
- Praticar boas práticas de desenvolvimento backend
- Simular um sistema real de gerenciamento de produtos em PDV

---

## 👩🏾‍💻 Desenvolvido por

Sophia Almeida
