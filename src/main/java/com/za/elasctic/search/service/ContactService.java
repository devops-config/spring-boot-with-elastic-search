package com.za.elasctic.search.service;

import com.za.elasctic.search.model.Contact;

import java.util.List;

public interface ContactService {
    List<Contact> getAll();

    void save(Contact contact);
}
