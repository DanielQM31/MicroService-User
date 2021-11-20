package com.nttdata.user.infraestructure.repository;

import com.nttdata.user.infraestructure.model.dao.UserDao;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface IUserCrudRepository extends ReactiveCrudRepository<UserDao, String> {



}
