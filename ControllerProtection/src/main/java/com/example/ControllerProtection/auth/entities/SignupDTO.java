package com.example.ControllerProtection.auth.entities;

import lombok.Data;

@Data
public class SignupDTO {

    //name of user
    private String name;
    //surname of user
    private String surname;
    //user email
    private String email;
    //user psw
    private String password;
}
