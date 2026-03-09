package org.bankv2;
import org.bankv2.model.Account;
import org.bankv2.service.AccountService;

public class App {
    public static void main(String[] args){
        System.out.println("Maven project is working!!");
//        System.out.println(System.getenv("DB_USERNAME"));
//        System.out.println(System.getenv("DB_PASSWORD"));
        AccountService service = new AccountService();
        service.createAccount("Preetham", 2000);
        System.out.print("Account created");

        Account account = service.getById(1L); //L- long
        if (account != null){
            System.out.println("Account ID: "+account.getId());
            System.out.println("Name: "+account.getName());
            System.out.println("Balance: "+account.getBalance());
        }else{
            System.out.println("Account not found");
        }

        service.deposit(1L, 300);
    }
}