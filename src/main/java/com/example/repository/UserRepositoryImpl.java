package com.example.repository;

import javax.persistence.EntityManager;

import com.example.manager.Manager;
import com.example.models.Users;

public class UserRepositoryImpl implements UserRepository {

    public void create(Users user) {
        EntityManager em = Manager.getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
        }
        catch (Exception e) {
            em.getTransaction().rollback();
        }
        finally {
            em.close(); 
        }
    }

    @Override
    public void save(Users user) {
        EntityManager em = Manager.getEntityManager();

        try {
            em.getTransaction().begin();
            em.merge(user);
            em.getTransaction().commit();
        }
        catch (Exception e) {
            em.getTransaction().rollback();
        }
        finally {
            em.close();
        }
    }

    @Override
    public Users findByEmail(String email) {
        EntityManager em = Manager.getEntityManager();

        try {
            Users find = em.find(Users.class, email);
            return find;
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error " + e.getMessage());
            return null;
        }
    }
    
}
