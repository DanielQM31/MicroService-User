package com.nttdata.banco.infraestructure.rest;

import com.nttdata.banco.application.UserOperations;
import com.nttdata.banco.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserOperations userOperations;

    @GetMapping
    public Flux<User> get() {
        return Flux.fromIterable(userOperations.queryAll());
    }

    /*@GetMapping
    public Flux<User> getId(@PathVariable String id) {
        return Flux.fromIterable(userOperations.queryAll());
    }*/

    @PostMapping
    public Mono<User> post(@RequestBody User user) {

        return Mono.justOrEmpty(userOperations.create(user));
    }

    @PutMapping
    public Mono<User> put(@PathVariable String id, @RequestBody User user){
        return Mono.justOrEmpty(userOperations.update(id, user));
    }

    @DeleteMapping
    public void delete(@PathVariable String id){

        userOperations.delete(id);
    }


}
