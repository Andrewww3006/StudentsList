package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{

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


        List <Students> studentsList = new ArrayList<Students>();

        for (int i = 0; i < 19; i++)
        {
            Students student = new Students(i,18, 2);
            studentsList.add(student);

        }
        for (Students x: studentsList)
            System.out.println(x.getName() +" "+ x.getFacultet());


    }
}
