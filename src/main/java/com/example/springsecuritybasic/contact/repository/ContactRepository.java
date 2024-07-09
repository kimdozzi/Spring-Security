package com.example.springsecuritybasic.contact.repository;

import com.example.springsecuritybasic.contact.domain.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
}
