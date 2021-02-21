package com.java.modulo01;

public class Main {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Dario");
        Aluno a2 = new Aluno("Fario");
        Aluno a3 = new Aluno("Mario");
        Aluno a4 = new Aluno("Yario");
        Aluno a5 = new Aluno("Jario");
        Aluno a6 = new Aluno("Pario");

        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(a3);

        int tamanhoVetor = lista.tamanho();

        System.out.println(tamanhoVetor);
        System.out.println(lista);
    }
}
