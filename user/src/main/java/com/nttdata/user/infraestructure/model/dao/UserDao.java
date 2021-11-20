package com.nttdata.user.infraestructure.model.dao;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("user")
public class UserDao {

    @Id
    private String id;
    private String dni;
    private String firstName;
    private String lastName;
    private String birthday;

}
