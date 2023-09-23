package com.example.demo.Library;

import jakarta.persistence.*;
import org.springframework.stereotype.Service;

@Entity
@Table(name = "users_list")
public class LibraryUser {
    @Id
    @SequenceGenerator(
            name="user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
          strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private long id;
    private String name;
    private String email;
    private String password;

    public LibraryUser(String name,
                       String email,
                       String password)
    {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public LibraryUser(long id,
                       String name,
                       String email,
                       String password)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public LibraryUser() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "users_list" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
