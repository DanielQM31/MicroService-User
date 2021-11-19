package com.nttdata.banco.application;

import com.nttdata.banco.domain.User;

import java.util.List;

public interface UserOperations {

    public List<User> queryAll();
    public User create(User user);
    public User update(String id, User user);
    public void delete(String id);
    public void publicUser(User user);


}
