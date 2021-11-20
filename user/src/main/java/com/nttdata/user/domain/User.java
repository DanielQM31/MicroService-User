package com.nttdata.user.domain;

import lombok.Data;

@Data
public class User {

    private String id;
    private String dni;
    private String firstName;
    private String lastName;
    private String birthday;

}
