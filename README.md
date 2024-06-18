# ContactManager

ContactManager é uma aplicação simples de agenda de contatos feita em Java. Com ela, você pode adicionar, remover, editar e visualizar contatos. Cada contato armazena informações como o nome, a data em que vocês se conheceram, o aniversário e quantos dias faltam para o próximo aniversário.

## Funcionalidades

- Adicionar novo contato
- Remover contato existente
- Editar informações de um contato
- Visualizar todos os contatos
- Login de usuário, onde cada usuário possui sua própria lista de contatos

## Estrutura do Projeto

ContactManager/
├── src/
│ ├── ContactManager.java
│ ├── Contact.java
│ ├── User.java
│ ├── UserManager.java
│ └── Utils.java
├── data/
│ └── users/
│ ├── user1.txt
│ └── user2.txt
├── README.md
├── .gitignore
└── build.xml


## Como Executar

1. Clone o repositório:
    ```sh
    git clone https://github.com/seu-usuario/ContactManager.git
    ```
2. Compile os arquivos Java:
    ```sh
    javac -d bin src/*.java
    ```
3. Execute a aplicação:
    ```sh
    java -cp bin ContactManager
    ```

## Uso

1. **Login**: Ao iniciar o programa, insira seu nome de usuário.
2. **Menu Principal**:
    - Digite `1` para adicionar um contato.
    - Digite `2` para remover um contato.
    - Digite `3` para editar um contato.
    - Digite `4` para visualizar todos os contatos.
    - Digite `5` para sair do programa.

3. **Adicionar Contato**: Insira o nome do contato, a data em que se conheceram (formato `yyyy-MM-dd`) e a data de aniversário (formato `yyyy-MM-dd`).

4. **Remover Contato**: Insira o nome do contato que deseja remover.

5. **Editar Contato**: Insira o nome do contato que deseja editar e, em seguida, os novos dados para o contato.

6. **Visualizar Contatos**: A lista de contatos será exibida, incluindo quantos dias faltam até o próximo aniversário de cada contato.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests no GitHub.

## Licença

Este projeto está licenciado sob a MIT License - veja o arquivo [LICENSE](LICENSE) para detalhes.
