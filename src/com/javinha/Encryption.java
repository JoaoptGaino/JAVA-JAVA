package com.javinha;

import java.util.Random;

public class Encryption {
//    public static String encrypt(String password){
//        String newPassword = "";
//        for (int i = 0;i<password.length();i++){
//            char[] charsInPassword = password.getChars(0,password.length());
//        }
//    }
    public static void main(String[] args) {
        Random random = new Random();
        char randomizedChar = (char)(random.nextInt(26)+'a');
        System.out.println(randomizedChar);
    }
}
