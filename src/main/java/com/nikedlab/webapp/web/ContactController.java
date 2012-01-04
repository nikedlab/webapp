/**
 * Created by CNR.
 * User: nike
 * Date: 1/4/12
 * Time: 12:34 AM
 */
package com.nikedlab.webapp.web;

import com.nikedlab.webapp.domain.Contact;
import com.nikedlab.webapp.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Map;


@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @RequestMapping("/index")
    public String listContact(Map<String, Object> map) {
        map.put("contact", new Contact());
        map.put("contactList", contactService.listContact());
        return "contact";
    }

    @RequestMapping("/")
    public String home() {
        return ("redirect:/index");
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("contact") Contact contact, BindingResult result) {
        contactService.addContact(contact);
        return ("redirect:/index");
    }

    @RequestMapping("/delete/{contactId}")
    public String deleteContact(@PathVariable("contactId") Integer id) {
        contactService.deleteContact(id);
        return ("redirect:/index");
    }

}
