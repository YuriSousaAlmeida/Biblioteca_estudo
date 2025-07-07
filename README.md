# 📚 Sistema de Controle de Biblioteca

Este é um projeto simples em Java que simula o funcionamento básico de uma biblioteca, permitindo o empréstimo e devolução de livros por usuários.

## 🚀 Funcionalidades

- Cadastro de livros com título, autor e disponibilidade.
- Cadastro de usuários com controle de empréstimo.
- Empréstimo de livros (apenas se estiverem disponíveis).
- Devolução de livros emprestados.
- Um usuário pode ter apenas **um** livro emprestado por vez.

## 📁 Estrutura do Projeto
biblioteca/
├── src/
│ ├── Livro.java # Classe que representa um livro
│ ├── Usuario.java # Classe que representa um usuário
│ └── Main.java # Classe principal com exemplo de uso
└── README.md # Documentação do projeto


## 💡 Como funciona

- O livro possui um estado (`disponível` ou `indisponível`).
- O usuário pode emprestar um livro se:
  - Ele **não tiver nenhum livro emprestado**.
  - O livro estiver **disponível**.
- O usuário pode devolver seu livro atual, tornando-o disponível novamente para outros.

## 🧪 Exemplo de uso

O arquivo `Main.java` contém um exemplo prático com dois livros e dois usuários, demonstrando:
- Empréstimo com sucesso
- Tentativas de emprestar livros indisponíveis
- Devolução e reempréstimo

## 🛠️ Requisitos

- Java 8 ou superior
- Compilador e terminal, ou uma IDE como IntelliJ IDEA ou Eclipse

## ▶️ Como executar

Compile e execute a classe `Main`:

```bash
javac Main.java
java Main
