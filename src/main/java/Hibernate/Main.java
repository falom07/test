package Hibernate;

import Hibernate.Entity.Company;
import Hibernate.Entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) throws InterruptedException {


            TestTransactional t1 = new TestTransactional();
            TestTransactional t2 = new TestTransactional();
            Thread thread1 = new Thread(t1);
            Thread thread2 = new Thread(t2);
            thread1.start();
            Thread.sleep(5000);
        }}

