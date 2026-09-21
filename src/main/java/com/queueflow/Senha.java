    package com.queueflow;

    public class Senha {
        private static int contador = 0;
        private int senha;

        public Senha(){
            contador++;
            senha = contador;
        }

        @Override
        public String toString() {
            return String.valueOf(senha);
        }
    }
