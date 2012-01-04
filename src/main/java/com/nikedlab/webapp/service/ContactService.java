package com.nikedlab.webapp.service;

import com.nikedlab.webapp.domain.Contact;

import java.util.List;

/**
 * Created by CNR.
 * User: nike
 * Date: 1/3/12
 * Time: 11:59 PM
 */
public interface ContactService {

    public void addContact(Contact contact);

    public List<Contact> listContact();

    public void deleteContact(Integer id);

}
