package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Students <T>{

private T id;
private String name;
private int age;
private String facultet;
private int kurs;
private List<Students> studentsList = new ArrayList<Students>();
  Students(){}


     Students(T id, int age, int kurs) {
        this.id = id;
        this.name = null;
        this.age = age;
        this.facultet = this.getFacultet();
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
    public T getId(){
      return id;
    }
    public int getAge(){
      return age;
    }
    public int getKurs(){
      return kurs;
    }

    public void setStudentsList(List<Students> studentsList) {
        this.studentsList = studentsList;
    }
    public List<Students> getStudentsList()
    {return studentsList;}

    public void printStudentsist()
    {
        for(Students x: studentsList)
            System.out.println(x.getName()+" "+ x.getId() + x.getFacultet() +x.getAge());
    }
}


