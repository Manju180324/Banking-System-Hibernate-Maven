package org.bankv2.service;

import org.bankv2.model.Account;
import org.bankv2.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AccountService {

    public void createAccount(String name, double balance){

        Session session = HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx = session.beginTransaction();

        Account account = new Account(name, balance);

        session.persist(account);

        tx.commit();
        session.close();
    }

    public Account getById(Long id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Account account = session.find(Account.class, id);
        session.close();
        return account;
    }

    public void deposit(Long id, double amount) {

        Session session = HibernateUtil
                .getSessionFactory()
                .openSession();

        Transaction tx = session.beginTransaction();

        Account account = session.get(Account.class, id);

        if (account != null) {

            double newBalance = account.getBalance() + amount;
            account.setBalance(newBalance);

            session.merge(account);

            System.out.println("Deposit successful");

        } else {

            System.out.println("Account not found");
        }
        tx.commit();
        session.close();
    }

}
