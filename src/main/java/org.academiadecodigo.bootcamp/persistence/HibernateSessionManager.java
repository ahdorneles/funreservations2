package org.academiadecodigo.bootcamp.persistence;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

/**
 * Created by codecadet on 20/03/2017.
 */
public class HibernateSessionManager {

    private static SessionFactory sessionFactory;

    static {
        try {

// Hold services needed by Hibernate
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .configure("hibernate.cfg.xml") // Load settings from hibernate.cfg.xml
                    .build();

            SessionFactory sessionFactory = new MetadataSources(serviceRegistry)
                    .buildMetadata() // Tell Hibernate about sources of metadata (database mappings)
                    .buildSessionFactory();

        } catch (HibernateException ex) {
            throw new ExceptionInInitializerError("Error creating hibernate session factory: " + ex.getMessage());
        }
        // hibernate initialization code
    }

    public static Session getSession() {
        // Hibernate will automatically open a new session if needed
        // Closing the session is not required
        return sessionFactory.getCurrentSession();
    }

    public static Session beginTransaction() {
        Session session = getSession();
        session.beginTransaction();
        return session;
    }

    public static void commitTransaction() {
        getSession().getTransaction().commit();

    }

    public static void rollBack() {
        getSession().getTransaction().rollback();
    }

    // Required to stop hibernate and allow the application to terminate
    public static void close() {
        sessionFactory.close();
    }
}

