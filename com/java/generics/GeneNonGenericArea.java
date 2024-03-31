package com.java.generics;

import java.util.ArrayList;

public class GeneNonGenericArea {
    public static void main(String[] args) {
        //Generc Area
        ArrayList<String> l = new ArrayList<String>();
        l.add("Shiva");
        l.add("Shiva");
        //l.add(2);Compilatoin Error
        m1(l);
        System.out.println(l);
        //l.add(true) //CE
    }

    private static void m1(ArrayList l) {//
        //Non-GenericAREA
        l.add(1);
        l.add(true);
    }
}
