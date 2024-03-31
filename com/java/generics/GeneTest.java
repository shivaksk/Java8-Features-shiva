package com.java.generics;

public class GeneTest {
    public static void main(String[] args) {
        GeneBoundedNumb<Integer> t = new GeneBoundedNumb<Integer>();
      //  Gene<String> str = new Gene<String>(); CE : so Gene class is bounded

        GeneBoundedRunnable<Runnable> r = new GeneBoundedRunnable<Runnable>();
        GeneBoundedRunnable<Thread> t2 = new GeneBoundedRunnable<Thread>();

        /*GeneBoundedRunnable<Integer> i = new GeneBoundedRunnable<Integer>();*/ // CE
    }
}
