package com.javinha;

import java.util.Scanner;

public class Riri17 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float velocidade, valorMulta;
        System.out.println("Velocidade do carro: ");
        velocidade = ler.nextFloat();
        if (velocidade > 80){
            System.out.println("Usuário multado!");
            valorMulta = (velocidade-80)*5;
            System.out.printf("O valor da multa será de %.2f ", valorMulta);
        }else{
            System.out.println("Usuário não multado!");
        }
    }
}
