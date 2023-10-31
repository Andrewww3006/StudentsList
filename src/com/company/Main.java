package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            FileWriter fileWriter = new FileWriter("Students.txt");
            fileWriter.write("Ivanov\nPetrov\nSidorov\nZaycev\n" +
                    "Mihalev\nPupkin\nMalkin\nBabkin\nVovkin\nGrishkin\n" +
                    "Titov\nTihonov\nMostovoy\nKarpin\nVolosov\nDenisov\n" +
                    "Zugano\nPehov\nStalin\nCvetkov");
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
        Students students = new Students();

        Random rd = new Random();
        for (int i = 1; i <= 20; i++) {
            studentsList.add(new Students<String>("01", rd.nextInt(25) + 18, rd.nextInt(5) + 1));
        }
        for (Students x : studentsList)
            System.out.println(x.getName() + " " + x.getFacultet() + " " + x.getId() + " " + x.getAge() + " " + x.getKurs());
    //    students.setStudentsList(studentsList);
        System.out.println();
        for (Students x : studentsList)
            System.out.println(x.getName() + " " + x.getFacultet() + " " + x.getId() + " " + x.getAge() + " " + x.getKurs());
       // students.setStudentsList(studentsList);
        //students.printStudentsist();
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
                case 6:
                    //studentsList.printStudentsist();
                    break;


            }


        }
        while (operation != 0);
    }
}
