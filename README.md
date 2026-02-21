# Fórum Hub - Challenge Alura 🚀

API REST robusta desenvolvida para simular o funcionamento de um fórum de discussões. Este projeto faz parte do desafio "Fórum Hub" da formação Java + Spring Boot da Alura.

## 🛠️ Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3.4.2**
- **Spring Security** (Autenticação via JWT)
- **Spring Data JPA** (Persistência de dados)
- **MySQL** (Banco de dados relacional)
- **Validation** (Bean Validation para regras de negócio)
- **Lombok** (Produtividade no código)
- **Maven** (Gerenciamento de dependências)

## 📌 Funcionalidades
- **CRUD de Tópicos:** Cadastro, Listagem, Detalhamento, Atualização e Exclusão.
- **Segurança:** Autenticação via Token JWT (Stateless).
- **Validações:**
    - Não é permitido tópicos duplicados (mesmo título e mensagem).
    - Campos obrigatórios validados com `@Valid`.
    - Tratamento de erros customizado (404 Not Found, 400 Bad Request).
- **Banco de Dados:** Relacionamentos ManyToOne entre Tópico, Usuário e Curso.

## 🚀 Como Executar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/SEU_USUARIO/forum-hub.git

## 🛠 Configuração do Banco de Dados
1. Crie um banco de dados no MySQL chamado `forumhub_db`.
2. No arquivo `src/main/resources/application.properties`, ajuste as seguintes linhas com o seu usuário e senha:
   ```properties
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha

## 🚀 Como Executar a Aplicação

### Via IntelliJ IDEA (Recomendado)
1. Abra o projeto no **IntelliJ**.
2. Aguarde o **Maven** baixar todas as dependências.
3. Localize o arquivo `ForumHubApplication.java` em `src/main/java/alura_challenge/forum_hub/`.
4. Clique com o botão direito no arquivo e selecione **Run 'ForumHubApplication'**.

### Via Terminal
1. Navegue até a pasta raiz do projeto.
2. Execute o comando:
```bash
./mvnw spring-boot:run
   
