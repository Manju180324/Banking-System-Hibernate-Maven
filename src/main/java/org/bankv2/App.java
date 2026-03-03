package org.bankv2;

public class App {
    public static void main(String[] args){
        System.out.println("Maven project is working!!");
        System.out.println(System.getenv("DB_USERNAME"));
        System.out.println(System.getenv("DB_PASSWORD"));
    }
}
