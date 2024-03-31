package com.java.generics;

public class AccountTest {
    public static void main(String[] args) {
        Account<Gold> goldAccount = new Account<Gold>(new Gold());
        goldAccount.print();


        Account<String> str = new Account<String>("Shiva");

        System.out.println(str.getType());
        str.print();

        Account<Silver> silverAccount = new Account<Silver>(new Silver());
        System.out.println(">>>" + silverAccount.getType());
        Silver type = silverAccount.getType();
        System.out.println(type.getId());
        silverAccount.print();
    }
}
