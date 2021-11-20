package com.nttdata.user.infraestructure.rest;

import com.nttdata.user.application.UserOperations;
import com.nttdata.user.domain.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserOperations userOperations;

    @GetMapping
    public Flux<User> get() {
        log.info("Listado de Usuarios");
        return userOperations.queryAll();
    }

    @GetMapping("/{id}")
    public Mono<User> getId(@PathVariable String id) {
        return userOperations.findId(id);
    }

    @PostMapping()
    public Mono<User> post(@RequestBody User user) {
        return userOperations.create(user);
    }

    @PutMapping
    public Mono<User> put(@PathVariable String id, @RequestBody User user) {
        return userOperations.update(id, user);
    }

    @DeleteMapping
    public void delete(@PathVariable String id){
        userOperations.delete(id);
    }

}
