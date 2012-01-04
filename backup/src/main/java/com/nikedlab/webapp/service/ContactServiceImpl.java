package com.nikedlab.webapp.service;

import com.nikedlab.webapp.dao.ContactDAO;
import com.nikedlab.webapp.domain.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by CNR.
 * User: nike
 * Date: 1/4/12
 * Time: 12:01 AM
 */

@Service
public class ContactServiceImpl implements ContactService{

    @Autowired
    private ContactDAO contactDAO;

    @Override
    @Transactional
    public void addContact(Contact contact) {
        contactDAO.addContact(contact);
    }

    @Override
    @Transactional
    public List<Contact> listContact() {
        return contactDAO.listContact();
    }

    @Override
    @Transactional
    public void deleteContact(Integer id) {
        contactDAO.deleteContact(id);
    }
}
