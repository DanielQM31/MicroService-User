package com.nttdata.user.application.model;

import com.nttdata.user.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserRepository {

    public Mono<User> getId(String id);
    public Flux<User> getAll();
    public Mono<User> save(User user);

}
