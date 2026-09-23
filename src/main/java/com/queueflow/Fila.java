package com.queueflow;

import java.util.ArrayList;

public class Fila {
    private ArrayList<Senha> espera = new ArrayList<>();
    private ArrayList<Senha> atendidas = new ArrayList<>();
    private ArrayList<Senha> em_atendimento = new ArrayList<>();


    public void chamarSenha() {
        if (espera.isEmpty()) {
            System.out.println("Não há senhas em espera");
            return;
        }


        Senha senha = espera.remove(0);
        senha.setStatus(StatusSenha.EM_ATENDIMENTO);
        em_atendimento.add(senha);
    }

    public void finalizarAtendimento() {
        if (em_atendimento.isEmpty()) {
            System.out.println("Não há senhas em atendimento ");
            return;
        }

        Senha senha = em_atendimento.remove(0);
        senha.setStatus(StatusSenha.ATENDIDA);
        atendidas.add(senha);
    }

    public Senha gerarSenha() {
        Senha novaSenha = new Senha();
        espera.add(novaSenha);
        return novaSenha;
    }

    public void resetarFila() {
        espera.clear();
        em_atendimento.clear();
        atendidas.clear();
    }
}
