package org.generation.jpamysqlsample.service;


import org.generation.jpamysqlsample.model.User;

import java.util.List;

public interface UserService
{

    User getUser( String id );

    User save( User user );

    void delete( String id );

}