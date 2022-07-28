package com.stefanini.onlinecatalog.dao;


import com.stefanini.onlinecatalog.JpaService;
import com.stefanini.onlinecatalog.entity.Subjects;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class DaoSubject implements DAO<Subjects> {
    private static final JpaService jpaService = JpaService.getInstance();
    private final EntityManagerFactory entityManagerFactory = jpaService.getEntityManagerFactory();
    private final EntityManager entityManager = entityManagerFactory.createEntityManager();

    @Override
    public void save(Subjects subject) {
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            boolean successfulPersist = false;
            transaction.begin();
            try {
                entityManager.persist(subject);
                successfulPersist = true;

            } finally {
                if (successfulPersist) transaction.commit();
                else transaction.rollback();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Optional get(Integer id) {
        return Optional.ofNullable(entityManager.find(Subjects.class, id));
    }

    public Subjects getObj(Integer id) {
        return entityManager.find(Subjects.class, id);
    }

    @Override
    public List<Subjects> getAll() {
        Query query = entityManager.createQuery("SELECT c FROM Subjects c", Subjects.class);
        return query.getResultList();
    }

    @Override
    public void update(Subjects s) {
//        executeInsideTransaction(entityManager -> entityManager.merge(s));
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(s);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void delete(Subjects s) {
        Subjects persistentInstance = entityManager.merge(s);
//        executeInsideTransaction(entityManager -> entityManager.remove(persistentInstance));
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.remove(persistentInstance);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            System.out.println(e.getMessage());
        }
    }

//    private void executeInsideTransaction(Consumer<EntityManager> action) {
//        EntityTransaction tx = entityManager.getTransaction();
//        try {
//            tx.begin();
//            action.accept(entityManager);
//            tx.commit();
//        } catch (Exception e) {
//            tx.rollback();
//            System.out.println(e.getMessage());
//        }
//    }
    public void closeEntityManager() {
        if (entityManager != null)
            entityManager.close();
    }
}
