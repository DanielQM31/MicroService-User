package com.nttdata.banco.application.impl;

import com.nttdata.banco.application.UserOperations;
import com.nttdata.banco.application.model.UserRepository;
import com.nttdata.banco.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserOperationsImpl implements UserOperations {

    @Autowired
    UserRepository repository;

    @Override
    public List<User> queryAll() {
        return null;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User update(String id, User user) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void publicUser(User user) {

    }
}
