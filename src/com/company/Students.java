package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Students <T>{

private T id;
private String name;
private int age;
private String facultet;
private int kurs;

  Students(){}


     Students(T id, int age, int kurs) {
        this.id = id;
        this.name = getName();
        this.age = age;
        this.facultet = getFacultet();
        this.kurs = kurs;
    }

    public String getName() {
        String name = null;
        Random r = new Random();
        try {
            BufferedReader stringBuffer = new BufferedReader(new FileReader("Students.txt"));
            for(int i = 0; i < r.nextInt(20); i++)
            stringBuffer.readLine();
            name = stringBuffer.readLine();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        return name;
    }

    public String getFacultet() {
        String facultet = null;
        Random r = new Random();
        try {
            BufferedReader stringBuffer = new BufferedReader(new FileReader("Facultets.txt"));
            for(int i = 0; i < r.nextInt(5); i++)
                stringBuffer.readLine();
            facultet = stringBuffer.readLine();

        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        return facultet;
    }
}


