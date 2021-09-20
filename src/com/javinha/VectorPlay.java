package com.javinha;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VectorPlay {
    public static void main(String[] args) {
        List<User> list = new ArrayList<User>();
        int greaterThanEighteen=0;
        list.add(new User(1, "João", "joao@joao", 20));
        list.add(new User(2, "Jão", "jao@joao", 12));
        list.add(new User(3, "Riri", "riri@joao", 18));


//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }

        List<String> userString = list.stream().map(user -> user.getAge() >= 18 ? user.getName() + " can drink alcohol" : user.getName() + " can't drink alcohol").collect(Collectors.toList());

        for(int i=0;i<userString.size();i++){
            System.out.println(userString.get(i));;
        }

    }
}
