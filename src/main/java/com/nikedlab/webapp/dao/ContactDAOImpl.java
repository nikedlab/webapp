package com.nikedlab.webapp.dao;

import com.nikedlab.webapp.domain.Contact;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContactDAOImpl implements ContactDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addContact(Contact contact) {
        sessionFactory.getCurrentSession().save(contact);
    }

    @SuppressWarnings("unchecked")
    public List<Contact> listContact() {
        return sessionFactory.getCurrentSession().createQuery("from Contact").list();

    }

    public void removeContact(Integer id) {
        Contact contact = (Contact) sessionFactory.getCurrentSession().load(
                Contact.class, id);
        if (null != contact) {
            sessionFactory.getCurrentSession().delete(contact);
        }

    }
}