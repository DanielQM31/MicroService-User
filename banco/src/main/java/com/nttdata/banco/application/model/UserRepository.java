package com.nttdata.banco.application.model;

import com.nttdata.banco.domain.User;

import java.util.List;

public interface UserRepository {

    public User getId(String id);
    public List<User> getAll();

}
