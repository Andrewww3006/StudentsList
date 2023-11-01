package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            FileWriter fileWriter = new FileWriter("Students.txt");
            fileWriter.write("""
                    Ivanov
                    Petrov
                    Sidorov
                    Zaycev
                    Mihalev
                    Pupkin
                    Malkin
                    Babkin
                    Vovkin
                    Grishkin
                    Titov
                    Tihonov
                    Mostovoy
                    Karpin
                    Volosov
                    Denisov
                    Zugano
                    Pehov
                    Stalin
                    Cvetkov""");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            FileWriter fileWriter = new FileWriter("Facultets.txt");
            fileWriter.write("KSIS\nFTUG\nFZO\nFMP\nVMSIS");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        List<Students> studentsList = new ArrayList<>();

        Random rd = new Random();
        for (int i = 1; i <= 20; i++) {
            studentsList.add(new Students<Integer>(i, rd.nextInt(25) + 18, rd.nextInt(5) + 1));
        }
        for (Students x : studentsList)
            System.out.println(x.getName() + " " + x.getFacultet() + " " + x.getId() + " " + x.getAge() + " " + x.getKurs());


        Scanner sc = new Scanner(System.in);
        int operation;
        do {
            operation = sc.nextInt();

            switch (operation) {
                case 1:
                    Students<Integer> student = new Students<Integer>(studentsList.size() + 1, rd.nextInt(25) + 18, rd.nextInt(5) + 1);
                    studentsList.add(student);
                    System.out.println(student.getName() + " " + student.getFacultet() + " " + student.getId()
                            + " " + student.getAge() + " " + student.getKurs());
                    break;
                case 2:
                    System.out.println("id?");
                    Integer id = sc.nextInt();
                    for (Students x : studentsList) {
                        if (id == x.getId()) {
                            System.out.println("remove:" + x.getName() + " " + x.getId());
                            studentsList.remove(x);
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.println("id?");
                    Integer id2 = sc.nextInt();
                    for (Students x : studentsList) {
                        if (id2 == x.getId()) {
                            System.out.println("edit:" + x.getName() + " " + x.getId());
                            int editOperation = sc.nextInt();
                            switch (editOperation){
                                case 1:
                                    String name = sc.next();
                                    x.setName(name);
                                    break;
                                case 2:
                                    int id3 = sc.nextInt();
                                    x.setId(id3);
                                    break;
                            }
                            break;
                        }
                    }
                    break;
                case 4:
                        Comparator<Students> pcomp = new PersonComparator().thenComparing(new AgeComparator());
                        studentsList.sort(pcomp);
                    for (Students x : studentsList)
                        System.out.println(x.getName() + " " + x.getFacultet() + " " + x.getId() + " " + x.getAge() + " " + x.getKurs());
                    break;
                case 6:
                    for (Students x : studentsList)
                        System.out.println(x.getName() + " " + x.getFacultet() + " " + x.getId() + " " + x.getAge() + " " + x.getKurs());
                    break;


            }


        }
        while (operation != 0);
    }
}
