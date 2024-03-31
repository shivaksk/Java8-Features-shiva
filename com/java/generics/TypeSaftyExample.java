package com.java.generics;

import java.util.*;

public class TypeSaftyExample {
    public static void main(String[] args) {
        /*1. Arrays are Type Safty*/
        String[] strArray = new String[100];
        strArray[0] = "Shiva";
        strArray[1] = "kumar";
//    strArray[3] = 123; CE
        System.out.println(strArray);


        /*2. same topic with Collection*/
        ArrayList list = new ArrayList();
        list.add("shiva");
        list.add(123);
        System.out.println(list);
        System.out.println(list.get(0));
        String o = (String) list.get(1);
        System.out.println(o);
        /*note: if you see this list contains string and integers*/


        /*Note: To overcome type casting and type-saftey ,we should go for GENERICS concept:*/

        /*HOW TO PROVIDE TYPE SAFTEY AND HOW TO RESOLVE TYPE CASTING*/
    /*
    Example :
    without type safe and required type casting while retrieval */
        ArrayList list2 = new ArrayList();

        /*Below is example with type safe and no type casting required*/
        ArrayList<String> strlist = new ArrayList<String>();

        /*conclusion 1:*/

        ArrayList<String> arrayList = new ArrayList<String>();
        //apply polymophism list l = AL,LL,V
        List<String> list11 = new ArrayList<String>();
        List<String> list22 = new LinkedList<String>();
        List<String> list3 = new Vector<String>();

        Collection<String> c1 = new ArrayList<String>();
        Collection<String> c2 = new LinkedList<String>();
        Collection<String> c3 = new Vector<String>();

        /*conclusion 1: Collections can't hold primitive types*/
        // Collection<int> cc = new ArrayList<int>();

    }

}
