package org.generation.jpamysqlsample.service;


import org.generation.jpamysqlsample.model.User;

import java.util.ArrayList;
import java.util.List;

public interface UserService
{

    User getUser( Integer id );

    User save( User user );

    void delete( Integer id );

    ArrayList<User> findByName(String name);

    ArrayList<User> findAll();
}
