package com.queueflow;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.gerarSenha();
        fila.gerarSenha();
        fila.gerarSenha();

        System.out.println("Aguarde...");

        fila.chamarSenha();
        fila.chamarSenha();

        System.out.println(fila.espera);
        System.out.println(fila.em_atendimento);

        fila.finalizarAtendimento();

        System.out.println(fila.em_atendimento);
        System.out.println(fila.espera);

    }

}