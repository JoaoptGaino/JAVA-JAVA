package com.javinha;

import java.util.Scanner;

public class BiggestAgeProvided {

    public static void main(String[] args) {
        int array[] = new int[5];
        int aux = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Write a number");
            array[i] = sc.nextInt();
        }
        for(int i=0;i<array.length;i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    aux=array[i];
                    array[i]=array[j];
                    array[j]=aux;
                }
            }
        }
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
    }
}
