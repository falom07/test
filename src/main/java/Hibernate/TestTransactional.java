package Hibernate;

import Hibernate.Entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.type.descriptor.java.spi.JsonJavaType;

import java.util.concurrent.atomic.AtomicInteger;

public class TestTransactional implements Runnable {
    private static AtomicInteger atomicInteger = new AtomicInteger();
    @Override
    public void run() {
        try {
            check();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void check() throws InterruptedException {
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        try(SessionFactory factory = config.buildSessionFactory();
            Session session = factory.openSession()) {
            System.out.println( atomicInteger.incrementAndGet());
        session.beginTransaction();
        if (atomicInteger.get() == 2){
            System.out.println("wait");
            Thread.sleep(5000);
        }
        User user = session.get(User.class, 1);
        System.out.println(user);
         if(atomicInteger.get() == 1) {
             System.out.println("remove...");
             session.remove(user);
             session.flush();
             Thread.sleep(15000);

         }
//        User user2 = session.get(User.class, 1);
//        System.out.println(user2);

        session.getTransaction().commit();
    }}
}
