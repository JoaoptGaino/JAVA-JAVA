package com.javinha;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1,n2, media;

        try{
            System.out.println("Nota 1:");
            n1 = sc.nextFloat();
            System.out.println("Nota 2: ");
            n2 = sc.nextFloat();
            media = (n1+n2)/2;
            System.out.println("Média: "+ media);
        }catch(Exception e){
            System.out.println(e);
            throw new Error(e);
        }
    }
}
