package com.example.repository;

import com.example.models.Users;

public interface UserRepository {

    public void create(Users user);

    public void save(Users user);

    public Users findByEmail(String email);
}
