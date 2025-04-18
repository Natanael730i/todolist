![image](https://github.com/user-attachments/assets/753ea504-6b27-4c2c-a8be-cd594d46cec1)


# 📝 ToDo List API

Uma API REST simples para gerenciamento de tarefas (ToDo List), construída com **Java**, **Spring Boot**, **Hibernate** e **PostgreSQL**.

---

## 🚀 Funcionalidades

- ✅ Criação de tarefas
- 📝 Edição de tarefas
- ❌ Exclusão de tarefas
- 🔄 Marcar tarefa como concluída/não concluída
- 📄 Listagem de todas as tarefas
- 🔐 Autenticação de usuário com JWT (em desenvolvimento)

---

## 🧱 Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Data JPA (Hibernate)
- PostgreSQL
- Spring Security (em desenvolvimento)
- Maven

---

## 📦 Como rodar o projeto

### Pré-requisitos:
- Java 17+
- PostgreSQL
- Maven

### Passos:

1. Clone o repositório:

```bash
git clone https://github.com/Natanael730i/todolist.git
```

2. Configure o application.properties com suas credenciais do banco:
```code
spring.datasource.url=jdbc:postgresql://localhost:5432/todolist
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

3. Rode a aplicação:
```code
./mvnw spring-boot:run
```

## 🔒 Segurança (em desenvolvimento)
A próxima etapa do projeto é adicionar autenticação com JWT para proteger os endpoints. O código já está sendo estruturado para isso.

## 📌 Status do projeto

### 🚧 Em desenvolvimento
funcionalidades básicas implementadas, melhorias em andamento.

### 🤝 Contribuição
Sinta-se à vontade para abrir issues ou enviar PRs com sugestões e melhorias.

### 👨‍💻 Autor
Natanael730i

