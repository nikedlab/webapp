package com.nikedlab.webapp.dao;

import com.nikedlab.webapp.domain.Contact;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by CNR.
 * User: nike
 * Date: 1/3/12
 * Time: 11:48 PM
 */
@Repository
public class ContactDAOImpl implements ContactDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addContact(Contact contact) {
        sessionFactory.getCurrentSession().save(contact);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Contact> listContact() {
        return sessionFactory.getCurrentSession().createQuery("from Contact").list();
    }

    @Override
    public void deleteContact(Integer id) {
        Contact contact = (Contact) sessionFactory.getCurrentSession().load(Contact.class, id);
        if ( contact != null ) {
            sessionFactory.getCurrentSession().delete(contact);
        }
    }
}
