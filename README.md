# 📝 TaskFlow API - Gerenciamento de Tarefas (Full Stack)

Esta é uma aplicação completa para o gerenciamento de tarefas (To-Do List). O projeto conta com uma API REST robusta desenvolvida em **Spring Boot** integrada ao banco de dados **Supabase** e uma interface web moderna e responsiva.

## 🚀 Tecnologias Utilizadas

### **Backend**
* **Java 17/21**
* **Spring Boot 3**
    * Spring Web (REST API)
    * Spring Data JPA (Persistência)
* **Supabase** (PostgreSQL na nuvem)
* **Maven** (Gerenciador de dependências)

### **Frontend**
* **HTML5 & CSS3** (Interface em Dark Mode com detalhes em Azul)
* **JavaScript (Vanilla)** (Consumo da API via Fetch API)



## 🏗️ Arquitetura do Projeto

O projeto segue o padrão **MVC (Model-View-Controller)**, garantindo a separação de responsabilidades:
- **Controller:** Gerencia as rotas e requisições HTTP.
- **Service:** Contém a lógica de negócio da aplicação.
- **Model:** Representa a entidade de dados (Tarefas).
- **Data (Repository):** Interface de comunicação com o banco de dados via JPA.
- **Frontend:** Camada de interação com o usuário integrada via chamadas assíncronas.

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

### **1. Backend**
1. Clone o repositório: 
   ```bash
   git clone [https://github.com/lkznx7/Task-Flow-API](https://github.com/lkznx7/Task-Flow-API)
