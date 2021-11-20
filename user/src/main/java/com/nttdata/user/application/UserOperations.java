package com.nttdata.user.application;

import com.nttdata.user.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserOperations {

    public Flux<User> queryAll();
    public Mono<User> findId(String id);
    public Mono<User> create(User user);
    public Mono<User> update(String id, User user);
    public void delete(String id);
    public void publicUser(User user);

}
