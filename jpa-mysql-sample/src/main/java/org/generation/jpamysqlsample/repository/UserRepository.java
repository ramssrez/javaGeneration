package org.generation.jpamysqlsample.repository;

import org.generation.jpamysqlsample.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface UserRepository extends CrudRepository<User, String> {
    ArrayList<User> findByName(String name);
}
