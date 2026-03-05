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

}
