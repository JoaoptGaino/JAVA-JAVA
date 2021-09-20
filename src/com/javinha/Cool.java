package com.javinha;

import java.time.LocalDate;
import java.util.Scanner;

public class Cool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, sexo;
        float valorCompras, desconto,peso,altura,imc;

        System.out.println("Peso");
        peso = sc.nextFloat();

        System.out.println("Altura");
        altura = sc.nextFloat();
        imc = peso / (float) Math.pow(altura, 2);

        System.out.printf("Imc: %.2f", imc);
        sc.close();
    }
}
