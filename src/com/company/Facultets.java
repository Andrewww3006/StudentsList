package com.company;

import java.util.ArrayList;

public class Facultets{
    String facultetName;
    ArrayList<Students>  studentsOfFacultet = new ArrayList <>();

    Facultets(String facultetName, ArrayList<Students> studentsOfFacultet){

        this.facultetName = facultetName;
        this.studentsOfFacultet = studentsOfFacultet;

    }

    public String getFacultetName(){
        return facultetName;
    }

    public ArrayList<Students> getStudentsOfFacultet(){
        return studentsOfFacultet;
    }





}
