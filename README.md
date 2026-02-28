# 📝 TaskFlow API - Gerenciamento de Tarefas com Spring Boot & Supabase

Esta é uma API REST desenvolvida para o gerenciamento de tarefas (To-Do List), focada em boas práticas de desenvolvimento, persistência de dados na nuvem e organização em camadas.

## 🚀 Tecnologias Utilizadas

* **Java 17/21**
* **Spring Boot 3**
    * Spring Web (REST API)
    * Spring Data JPA (Persistência)
* **Supabase** (PostgreSQL na nuvem)
* **Maven** (Gerenciador de dependências)

## 🏗️ Arquitetura do Projeto

O projeto segue o padrão **MVC (Model-View-Controller)**, garantindo a separação de responsabilidades:
- **Controller:** Gerencia as rotas e requisições HTTP.
- **Service:** Contém a lógica de negócio da aplicação.
- **Model:** Representa a entidade de dados (Tarefas).
- **Repository:** Interface de comunicação com o banco de dados via JPA.

## 🔌 Endpoints da API

A API expõe os seguintes endpoints para a tabela `tarefas`:

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| **GET** | `/api/tarefas` | Retorna todas as tarefas. |
| **GET** | `/api/tarefas/{id}` | Busca uma tarefa por ID. |
| **POST** | `/api/tarefas` | Cria uma nova tarefa. |
| **PUT** | `/api/tarefas/{id}` | Atualiza uma tarefa existente. |
| **DELETE** | `/api/tarefas/{id}` | Remove uma tarefa do banco. |

## ⚙️ Como executar o projeto

1. Clone o repositório: `git clone https://github.com/SEU_USUARIO/NOME_DO_REPO`
2. Configure as credenciais do seu banco Supabase no arquivo `src/main/resources/application.properties`.
3. Execute o comando: `mvn spring-boot:run`
