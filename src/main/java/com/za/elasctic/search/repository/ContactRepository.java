package com.za.elasctic.search.repository;

import com.za.elasctic.search.model.Contact;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ContactRepository extends ElasticsearchRepository<Contact, String> {
}
