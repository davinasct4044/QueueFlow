package com.queueflow;

import java.util.ArrayList;

public class Fila {

    // Lista de senhas que ainda aguardam atendimento.
    private ArrayList<Senha> espera = new ArrayList<>();

    // Lista de senhas que já tiveram o atendimento finalizado.
    private ArrayList<Senha> atendidas = new ArrayList<>();

    // Lista de senhas que estão sendo atendidas no momento.
    private ArrayList<Senha> emAtendimento = new ArrayList<>();


    // Retorna as senhas que estão atualmente em atendimento.
    public ArrayList<Senha> getEmAtendimento() {
        return emAtendimento;
    }

    // Retorna as senhas que já foram atendidas.
    public ArrayList<Senha> getAtendidas() {
        return atendidas;
    }

    // Retorna as senhas que ainda estão aguardando atendimento.
    public ArrayList<Senha> getEspera() {
        return espera;
    }


    // Chama a próxima senha da fila seguindo a ordem de chegada.
    public void chamarSenha() {

        // Verifica se existe alguma senha aguardando.
        if (espera.isEmpty()) {
            System.out.println("Não há senhas em espera");
            return;
        }

        // Remove a primeira senha da lista de espera.
        // O índice 0 representa a primeira posição da fila.
        Senha senha = espera.remove(0);

        // Altera o status da senha para "em atendimento".
        senha.setStatus(StatusSenha.EM_ATENDIMENTO);

        // Adiciona a senha à lista de atendimentos em andamento.
        emAtendimento.add(senha);
    }


    // Finaliza o atendimento da próxima senha em atendimento.
    public void finalizarAtendimento() {

        // Verifica se existe alguma senha sendo atendida.
        if (emAtendimento.isEmpty()) {
            System.out.println("Não há senhas em atendimento ");
            return;
        }

        // Remove a primeira senha da lista de atendimento.
        Senha senha = emAtendimento.remove(0);

        // Altera o status da senha para "atendida".
        senha.setStatus(StatusSenha.ATENDIDA);

        // Adiciona a senha à lista de atendimentos finalizados.
        atendidas.add(senha);
    }


    // Cria uma nova senha e coloca ela na fila de espera.
    public Senha gerarSenha() {

        // Cria uma nova senha.
        // O construtor da classe Senha gera seu número automaticamente.
        Senha novaSenha = new Senha();

        // Adiciona a nova senha ao final da fila de espera.
        espera.add(novaSenha);

        // Retorna a senha criada.
        return novaSenha;
    }


    // Remove todas as senhas de todas as listas da fila.
    public void resetarFila() {
        espera.clear();
        emAtendimento.clear();
        atendidas.clear();
    }
}