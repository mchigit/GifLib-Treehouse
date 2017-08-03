package com.teamtreehouse.giflib.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.teamtreehouse.giflib.model.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by micha on 2017-08-01.
 */
@Repository
public class CategoryDaoImpl implements CategoryDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<com.teamtreehouse.giflib.model.Category> findAll() {
        Session session = sessionFactory.openSession();

        List<com.teamtreehouse.giflib.model.Category> categories = session.createCriteria(com.teamtreehouse.giflib.model.Category.class).list();

        session.close();
        return categories;
    }

    @Override
    public com.teamtreehouse.giflib.model.Category findById(Long id) {
        return null;
    }

    @Override
    public void save(com.teamtreehouse.giflib.model.Category category) {
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        session.save(category);

        session.getTransaction().commit();

        session.close();
    }

    @Override
    public void delete(com.teamtreehouse.giflib.model.Category category) {

    }
}
