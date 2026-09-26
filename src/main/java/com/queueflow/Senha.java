package com.queueflow;

public class Senha {
    // Contador compartilhado entre todas as senhas criadas.
    // É static porque existe apenas um contador para a classe.
    private static int contador = 0;

    // Número individual desta senha.
    private int senha;

    // Toda senha começa aguardando atendimento.
    private StatusSenha status = StatusSenha.AGUARDANDO;

    // Construtor: é executado automaticamente quando uma nova senha é criada.
    public Senha() {
        contador++;
        senha = contador;
    }

    // Altera o status atual da senha.
    public void setStatus(StatusSenha status) {
        this.status = status;
    }

    // Retorna o status atual da senha.
    public StatusSenha getStatus() {
        return status;
    }

    // Define como a senha será representada quando for exibida como texto.
    @Override
    public String toString() {
        return String.valueOf(senha) + "-" + status;
    }
}