package com.nttdata.user.infraestructure.spring.config;

import com.nttdata.user.application.model.UserRepository;
import com.nttdata.user.infraestructure.repository.UserCrudRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public UserRepository repository(){
        return new UserCrudRepository();
    }

}
