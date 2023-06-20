package com.za.elasctic.search;

import com.za.elasctic.search.model.Contact;
import com.za.elasctic.search.service.ContactService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@Slf4j
@AllArgsConstructor
@SpringBootApplication
public class Application implements CommandLineRunner {

    private final ContactService contactService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {
        log.info("initial-data-size ========>>>> {}", contactService.getAll().size());
        contactService.save(getContact());
        log.info("after-data-entry-size ========>>>> {}", contactService.getAll().size());
        log.info("get-data-from-elastic ========>>>> {}", contactService.getAll());
    }

    private Contact getContact() {
        Contact contact = new Contact();
        contact.setId(UUID.randomUUID().toString());
        contact.setName("Zara");
        contact.setAddress("Bangladesh");
        return contact;
    }
}
