package com.sdm.hibernate;

import com.sdm.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudent {

    public static void main(String[] args) {
        // Create Session Factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // Create Session
        Session session = factory.getCurrentSession();

        try {
            // Start Transaction
            session.beginTransaction();

            // Query all students
            System.out.println("List all students");
            List<Student> students = session.createQuery("from Student").list();

            listStudents(students);


            //Query students with gmail address
            System.out.println("List students with Gmail address");
            students = session.createQuery("from Student s where  s.email like '%gmail.com'").list();

            listStudents(students);

            // Commit Transaction
            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            factory.close();
        }
    }

    private static void listStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
