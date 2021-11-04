package org.generation.jpamysqlsample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity(name = "Users")
public class User
{
    @Id
    @GeneratedValue
    private String id;

    private String name;

    @Column(name = "last_name")
    private String lastName;

    private String email;

    public User()
    {
    }

    public User( String name, String id, String lastName )
    {
        this.name = name;
        this.id = id;
        this.lastName = lastName;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getId()
    {
        return id;
    }

    public void setId( String id )
    {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
