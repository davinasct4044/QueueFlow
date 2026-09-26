# QueueFlow

Sistema de gerenciamento de filas desenvolvido em Java, criado com o objetivo de praticar conceitos de Programação Orientada a Objetos (POO), Collections e organização de responsabilidades entre classes.

## Sobre o projeto

O QueueFlow simula o funcionamento de uma fila de atendimento.

O sistema permite gerar senhas, colocá-las em espera, chamar a próxima senha para atendimento e finalizar o atendimento.

Cada senha possui um número e um status que representa seu estado atual no sistema.

## Funcionalidades

- Geração automática de senhas sequenciais
- Controle de senhas em espera
- Chamada de senhas seguindo a ordem de chegada (FIFO)
- Controle de senhas em atendimento
- Finalização de atendimentos
- Controle de status das senhas
- Reset completo da fila
- Tratamento de situações em que não existem senhas disponíveis

## Fluxo do sistema

    Gerar senha
         ↓
     AGUARDANDO
         ↓
    Chamar senha
         ↓
    EM_ATENDIMENTO
         ↓
    Finalizar atendimento
         ↓
      ATENDIDA

## Tecnologias

- Java
- IntelliJ IDEA
- Git
- GitHub

## Conceitos praticados

Durante o desenvolvimento foram utilizados conceitos fundamentais de Java e POO:

- Classes e objetos
- Encapsulamento
- Construtores
- `static`
- Métodos e atributos
- Referências de objetos
- `ArrayList`
- Enum
- `toString()`
- `@Override`
- Controle de fluxo
- Organização em pacotes
- Princípio FIFO
- Separação de responsabilidades

## Estrutura do projeto

    src/
    └── main/
        └── java/
            └── com/
                └── queueflow/
                    ├── Main.java
                    ├── Fila.java
                    ├── Senha.java
                    └── StatusSenha.java

## Exemplo de execução

    Aguarde...
    [2-AGUARDANDO, 3-AGUARDANDO]
    [1-EM_ATENDIMENTO]
    []
    ---------------------------------------------------------------------------------
    [2-AGUARDANDO, 3-AGUARDANDO]
    []
    [1-ATENDIDA]

Neste exemplo:

1. Três senhas são geradas.
2. A primeira senha é chamada.
3. As senhas 2 e 3 permanecem aguardando.
4. A senha 1 entra em atendimento.
5. O atendimento da senha 1 é finalizado.
6. A senha 1 passa para o estado `ATENDIDA`.

## Como executar

### Pré-requisitos

- Java JDK instalado
- IntelliJ IDEA ou outra IDE compatível

### Executando o projeto

Clone o repositório:

    git clone https://github.com/SEU-USUARIO/queueflow.git

Entre no diretório:

    cd queueflow

Abra o projeto na sua IDE e execute a classe `Main.java`.

## Próximos passos

O projeto foi desenvolvido inicialmente como uma aplicação Java pura para consolidar os fundamentos da linguagem.

Possíveis evoluções futuras:

- Persistência de dados com PostgreSQL
- Maven
- API REST com Spring Boot
- JPA/Hibernate
- Testes automatizados
- Docker