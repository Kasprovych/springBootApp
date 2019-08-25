package com.app.spring.repositories;

import com.app.spring.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author , Long> {
}
