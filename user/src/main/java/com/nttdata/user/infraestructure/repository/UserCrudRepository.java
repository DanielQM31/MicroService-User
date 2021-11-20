package com.nttdata.user.infraestructure.repository;

import com.nttdata.user.application.model.UserRepository;
import com.nttdata.user.domain.User;
import com.nttdata.user.infraestructure.model.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class UserCrudRepository implements UserRepository {

    @Autowired
    IUserCrudRepository repository;

    @Override
    public Mono<User> getId(String id) {
        return repository.findById(id)
                .map(this::mapUserDaoToUser);
    }

    @Override
    public Flux<User> getAll() {
        return repository.findAll()
                .map(this::mapUserDaoToUser);
    }

    @Override
    public Mono<User> save(User user) {
        return repository.save(mapUserToUserDao(user))
                .map(this::mapUserDaoToUser);
    }

    private User mapUserDaoToUser(UserDao userDao){
        User user = new User();
        user.setId(userDao.getId());
        user.setDni(userDao.getDni());
        user.setFirstName(userDao.getFirstName());
        user.setLastName(userDao.getLastName());
        user.setBirthday(userDao.getBirthday());
        return user;
    }

    private UserDao mapUserToUserDao(User user){
        UserDao userDao = new UserDao();
        userDao.setId(user.getId());
        userDao.setDni(user.getDni());
        userDao.setFirstName(user.getFirstName());
        userDao.setLastName(user.getLastName());
        userDao.setBirthday(user.getBirthday());
        return userDao;
    }

}
