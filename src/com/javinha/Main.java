package com.javinha;

import java.util.Scanner;

public class Main {
    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
    static float area(float base,float altura){
        return base*altura;
    }
    static float tinta(float area){
        return area/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Base: ");
        float base = sc.nextFloat();

        System.out.println("Altura: ");
        float altura = sc.nextFloat();

        float area = area(base,altura);

        System.out.printf("Area: %.2f \n",area);
        System.out.printf("Quantidade necessária: %.2f \n",tinta(area));


//        int number;
//        System.out.println("How many numbers?");
//        number = sc.nextInt();
//        for(int i = 0;i<number;i++){
//            System.out.print(fib(i)+ " ");
//        }
    }
}
