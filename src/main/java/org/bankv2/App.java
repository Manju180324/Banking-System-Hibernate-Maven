package org.bankv2;

import org.bankv2.service.AccountService;

public class App {
    public static void main(String[] args){
        System.out.println("Maven project is working!!");
//        System.out.println(System.getenv("DB_USERNAME"));
//        System.out.println(System.getenv("DB_PASSWORD"));
        AccountService service = new AccountService();
        service.createAccount("Manju", 1000);
        System.out.print("Account created");
    }
}
