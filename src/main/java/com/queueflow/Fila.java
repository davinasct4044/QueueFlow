package com.queueflow;

import java.util.ArrayList;

public class Fila {
    ArrayList<Senha> espera = new ArrayList<>();
    ArrayList<Senha> chamados = new ArrayList<>();

    public void chamarSenha() {
        if (espera.isEmpty()) {
            System.out.println("Não há senhas na fila");
            return;
        }

        Senha senha = espera.remove(0);
        chamados.add(senha);
    }

    public void colocarSenhaEmEspera(Senha senha) {
        espera.add(senha);
    }

    public void resetarFila() {
        espera.clear();
        chamados.clear();
    }
}
