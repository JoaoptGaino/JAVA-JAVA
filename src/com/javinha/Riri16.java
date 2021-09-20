package com.javinha;

import java.util.Scanner;

public class Riri16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int anosFumando, qntPorDia, reducaoEmMin;
        float reducaoEmDias;
        System.out.println("Quantidade de cigarros fumados por dia: ");
        qntPorDia = ler.nextInt();
        System.out.println("Quantos anos fumando: ");
        anosFumando = ler.nextInt();
        reducaoEmMin = anosFumando * 365 * qntPorDia * 10;
        reducaoEmDias = reducaoEmMin/(24*60);
        System.out.printf("Redução do tempo de vida: %.2f ", reducaoEmDias);
    }
}
