package com.sdm.hibernate;

import com.sdm.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudent {

    public static void main(String[] args) {
        // Create Session Factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // Create Session
        Session session = factory.getCurrentSession();

        try{
            System.out.println("Creating student");

            // Create Student
            Student student = new Student("Jasbir2", "Minhas2", "jasbir2.minhas@loblaw.ca");

            // Start Transaction
            session.beginTransaction();

            System.out.println("Saving student");
            // Save Student
            session.save(student);

            // Commit Transaction
            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            factory.close();
        }
    }
}
