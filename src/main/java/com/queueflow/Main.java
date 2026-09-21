package com.queueflow;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();

        Senha senha1 = new Senha();
        Senha senha2 = new Senha();
        Senha senha3 = new Senha();

        fila.colocarSenhaEmEspera(senha1);
        fila.colocarSenhaEmEspera(senha2);
        fila.colocarSenhaEmEspera(senha3);

        System.out.println("Aguarde...");

        fila.chamarSenha();
        fila.chamarSenha();

        System.out.println(fila.espera);
        System.out.println(fila.chamados);

        fila.resetarFila();


        System.out.println(fila.chamados);
        System.out.println(fila.espera);

    }

}