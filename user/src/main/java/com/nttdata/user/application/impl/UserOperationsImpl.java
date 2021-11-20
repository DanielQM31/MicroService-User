package com.nttdata.user.application.impl;

import com.nttdata.user.application.UserOperations;
import com.nttdata.user.application.model.UserRepository;
import com.nttdata.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserOperationsImpl implements UserOperations {

    private final UserRepository repository;

    @Override
    public Flux<User> queryAll() {
        return repository.getAll();
    }

    @Override
    public Mono<User> findId(String id) {
        return repository.getId(id);
    }

    @Override
    public Mono<User> create(User user) {
        return repository.save(user);
    }

    @Override
    public Mono<User> update(String id, User user) {
        return repository.update(id, user);
    }

    @Override
    public Mono<Void> delete(String id) {
        return repository.delete(id);
    }

    /*@Override
    public void publicUser(User user) {
    }*/
}
