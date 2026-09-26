package com.queueflow;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();
        System.out.println("Aguarde...");

        fila.chamarSenha();

        System.out.println("Em espera: " + fila.getEspera());
        System.out.println("Em atendimento: " + fila.getEmAtendimento());
        System.out.println("Atendidas: " + fila.getAtendidas());

        System.out.println("---------------------------------------------------------------------------------");

        fila.finalizarAtendimento();

        System.out.println("Em espera: " + fila.getEspera());
        System.out.println("Em atendimento: " + fila.getEmAtendimento());
        System.out.println("Atendidas: " + fila.getAtendidas());

    }

}