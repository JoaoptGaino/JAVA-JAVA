package com.javinha;

import java.util.Date;
import java.util.Scanner;

public class Riri18 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int anoNascimento, idade;
        System.out.println("Ano de nascimento: ");
        anoNascimento = ler.nextInt();
        idade = 2021 - anoNascimento;
        if (idade >= 18){
            System.out.println("Pode votar!");
        }else {
            System.out.println("Não pode votar!");
        }
    }
}
