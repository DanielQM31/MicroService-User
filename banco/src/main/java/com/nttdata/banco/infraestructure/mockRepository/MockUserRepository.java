package com.nttdata.banco.infraestructure.mockRepository;

import com.nttdata.banco.application.model.UserRepository;
import com.nttdata.banco.domain.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MockUserRepository implements UserRepository {

    @Override
    public User getId(String id) {
        User user = new User();
        user.setId("1");
        user.setDni("74585256");
        user.setNombres("Mario");
        user.setApellidos("Gutierrez");
        user.setFechaNac("25/12/1997");
        return user;
    }

    @Override
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        return users;
    }
}
