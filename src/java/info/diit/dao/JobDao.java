/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.diit.dao;

import info.diit.util.HibernateUtil;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Kamrul
 */
public class JobDao<T> {

    private Class<T> entityClass;
    protected final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    Session session = sessionFactory.openSession();

    public JobDao() {
        sessionFactory.openSession();
    }

    public JobDao(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public List<T> findAll() {
        try {
            if (!session.getTransaction().isActive()) {
                session.getTransaction().begin();
            }
            return session.createQuery("from " + entityClass.getName()).list();
        } catch (Exception e) {
            return null;
        }
    }

    public void update(T instance) throws Exception {
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive()) {
                sessionFactory.getCurrentSession().getTransaction().begin();
            }
            sessionFactory.getCurrentSession().merge(instance);
            sessionFactory.getCurrentSession().getTransaction().commit();

        } catch (Exception e) {
            sessionFactory.getCurrentSession().getTransaction().rollback();
            throw e;
        }
    }

    public void delete(T instance) throws Exception {
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive()) {
                sessionFactory.getCurrentSession().getTransaction().begin();
            }
            sessionFactory.getCurrentSession().delete(instance);
            sessionFactory.getCurrentSession().getTransaction().commit();
        } catch (Exception e) {
            sessionFactory.getCurrentSession().getTransaction().rollback();
            throw e;
        }
    }

    public boolean create(T instance) throws Exception {
        try {
            if (!session.getTransaction().isActive()) {
                session.getTransaction().begin();
            }
            session.persist(instance);
            session.getTransaction().commit();
            
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            
          
return false;
        }
    }

    public T find(Object primaryKey) {
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive()) {
                sessionFactory.getCurrentSession().getTransaction().begin();
            }
            return (T) sessionFactory.getCurrentSession().get(entityClass, (Serializable) primaryKey);
        } catch (Exception e) {
            return null;

        }
    }

}
