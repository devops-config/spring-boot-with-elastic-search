package com.za.elasctic.search.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "app_contact")
public class Contact {

    @Id
    private String id;

    private String name;

    private String address;
}
