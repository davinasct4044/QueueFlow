    package com.queueflow;

    public class Senha {
        private static int contador = 0;
        private int senha;
        private StatusSenha status = StatusSenha.AGUARDANDO;

        public Senha(){
            contador++;
            senha = contador;
        }

        public void setStatus(StatusSenha status) {
            this.status = status;
        }
        public StatusSenha getStatus() {
            return status;
        }

        @Override
        public String toString() {
            return String.valueOf(senha) + "-" + status;
        }
    }
