package com.nttdata.user.infraestructure.mockRepository;

import com.nttdata.user.application.model.UserRepository;
import com.nttdata.user.domain.User;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Component
public class MockUserRepository implements UserRepository {


    @Override
    public Mono<User> getId(String id) {
        User user = new User();
        user.setId("1");
        user.setDni("76788120");
        user.setFirstName("Carlos");
        user.setLastName("Meza");
        user.setBirthday("20/12/1996");
        return Mono.just(user);
    }

    @Override
    public Flux<User> getAll() {
        List<User> users = new ArrayList<>();
        return Flux.fromIterable(users);
    }

    @Override
    public Mono<User> save(User user) {
        return Mono.just(user);
    }
}
