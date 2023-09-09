package com.example.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@NoArgsConstructor
public class Users {

    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    @Getter
    @Setter
    private int id;

    @Column(name="name")
    @Getter
    @Setter
    private String name;

    @Column(name="lastname")
    @Getter
    @Setter
    private String lastname;

    @Id
    @Column(name="email")
    @Getter
    @Setter
    private String email;

    @Column(name="password")
    @Getter
    @Setter
    private String password;

    @Column(name="auto")
    @Getter
    @Setter
    private boolean auto;
}
