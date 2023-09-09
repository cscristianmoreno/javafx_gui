package com.example.manager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Manager {
    private static EntityManagerFactory entityManagerFactory;

    public Manager() {
        entityManagerFactory = Persistence.createEntityManagerFactory("fx_users");
    }
    
    public static EntityManager getEntityManager() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        return entityManager;
    }
}
