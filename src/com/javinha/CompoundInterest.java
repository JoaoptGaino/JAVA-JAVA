package com.javinha;
//ValorFuturo  = aportesMensais*((1+i)^n-1)/i
public class CompoundInterest {
    public static void main(String[] args) {
        double valorFuturo = 0;
        double aportesMensais=250;
        double taxa=0.07;
        double meses=24;

        valorFuturo=aportesMensais*(Math.pow(1+taxa,2)-1)/taxa;
        System.out.printf("%.2f",valorFuturo);
    }
}
