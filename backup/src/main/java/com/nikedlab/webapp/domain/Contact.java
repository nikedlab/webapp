/**
 * Created by CNR.
 * User: nike
 * Date: 1/3/12
 * Time: 11:34 PM
 */

package com.nikedlab.webapp.domain;

import javax.persistence.*;


@Entity
@Table(name = "Contacts")
public class Contact {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "FIRSTNAME")
    private String sFirstName;

    @Column(name = "LASTNAME")
    private String sLastName;

    @Column(name = "EMAIL")
    private String sEmail;

    @Column(name = "PHONE")
    private String sPhone;



}
