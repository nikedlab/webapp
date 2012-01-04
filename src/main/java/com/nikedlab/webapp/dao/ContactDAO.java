/**
 * Created by CNR.
 * User: nike
 * Date: 1/3/12
 * Time: 11:45 PM
 */

package com.nikedlab.webapp.dao;

import com.nikedlab.webapp.domain.Contact;
import java.util.List;


public interface ContactDAO {

    public void addContact(Contact contact);

    public List<Contact> listContact();

    public void removeContact(Integer id);
}