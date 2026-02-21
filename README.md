# Fórum Hub - Challenge Alura 🚀

O **Fórum Hub** é uma API REST desenvolvida em Java com Spring Boot para gerenciar um fórum de discussões. O objetivo principal é replicar as funcionalidades de back-end de um fórum, permitindo que usuários postem dúvidas sobre cursos e interajam de forma organizada e segura.

---

## 🛠️ Tecnologias Utilizadas

A aplicação foi construída utilizando as seguintes ferramentas e frameworks:

*   **Linguagem:** Java 17
*   **Framework:** Spring Boot 3.x
*   **Segurança:** Spring Security + JWT (JSON Web Token)
*   **Persistência:** Spring Data JPA / Hibernate
*   **Banco de Dados:** MySQL
*   **Gerenciador de Dependências:** Maven
*   **Validação:** Bean Validation (Hibernate Validator)
*   **Utilitários:** Lombok

---

## 📌 Funcionalidades

- **Autenticação:** Sistema de login seguro que gera um token JWT para o usuário.
- **CRUD de Tópicos:**
    - Cadastro de novos tópicos.
    - Listagem paginada e ordenada por data de criação.
    - Detalhamento de um tópico específico por ID.
    - Atualização de título e mensagem (apenas para o autor).
    - Exclusão de tópicos.
- **Regras de Negócio:**
    - Validação de campos obrigatórios.
    - Proteção contra tópicos duplicados (não permite o mesmo título e mensagem).
    - Tratamento de erros customizado (404 Not Found e 400 Bad Request).

---

## ⚙️ Configuração do Banco de Dados

1. Certifique-se de ter o **MySQL** instalado e rodando em sua máquina.
2. Crie um banco de dados chamado `forumhub_db`:

```sql
CREATE DATABASE forumhub_db;
```

---

## 🚀 Como Executar a Aplicação

### Via IntelliJ IDEA (Recomendado)
1. Abra o projeto no IntelliJ.
2. Aguarde o Maven baixar todas as dependências.
3. Localize o arquivo `ForumHubApplication.java` em `src/main/java/alura_challenge/forum_hub/`.
4. Clique com o botão direito no arquivo e selecione **Run 'ForumHubApplication'**.

### Via Terminal
1. Navegue até a pasta raiz do projeto.
2. Execute o comando:
```bash
./mvnw spring-boot:run
```

A API estará disponível em: `http://localhost:8080`

---

## 🔐 Documentação da API (Endpoints)

### Autenticação
| Método | Endpoint | Descrição | Acesso |
| :--- | :--- | :--- | :--- |
| POST | `/login` | Autentica o usuário e devolve o Token JWT | Público |

### Tópicos
> **Nota:** Todos os endpoints abaixo exigem o cabeçalho `Authorization: Bearer <seu_token>`.

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| GET | `/topicos` | Lista todos os tópicos (paginado) |
| GET | `/topicos/{id}` | Exibe detalhes de um tópico específico |
| POST | `/topicos` | Cadastra um novo tópico |
| PUT | `/topicos/{id}` | Atualiza o título e a mensagem de um tópico |
| DELETE | `/topicos/{id}` | Remove um tópico permanentemente |

---

## 📝 Exemplos de Requisição

### Cadastro de Tópico (`POST /topicos`)

**Corpo (JSON):**
```json
{
    "titulo": "Dúvida sobre JPA",
    "mensagem": "Como funciona o relacionamento ManyToOne?",
    "autorId": 1,
    "cursoId": 1
}
```

---

**Desenvolvido por [Sérgio](https://github.com/sergiodlima)** ⚡
