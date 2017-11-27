package com.sdm.hibernate;

import com.sdm.hibernate.entity.StorePreference;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class FetchProvince {

    public static void main(String[] args) {
        // Create Session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(StorePreference.class)
                .buildSessionFactory();

        try {
            // Get Session
            Session session = factory.getCurrentSession();

            session.beginTransaction();

            List<StorePreference> storePreferences =
                    session.createQuery("from StorePreference sp where sp.cdsp = 'STORE_EHR_JURISDICTION' ").list();

            for (StorePreference storePreference: storePreferences){
                System.out.println(storePreference);
            }
            session.getTransaction().commit();

        } finally {
            factory.close();
        }

    }
}
