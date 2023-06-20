package com.za.elasctic.search.service;

import com.za.elasctic.search.model.Contact;
import com.za.elasctic.search.repository.ContactRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@AllArgsConstructor
@Service("contactService")
public class ContactServiceImpl implements ContactService {

    private final ContactRepository repository;

    @Override
    public List<Contact> getAll() {
        return StreamSupport.stream(repository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public void save(Contact contact) {
        repository.save(contact);
    }
}
