package com.example.ControllerProtection.auth.entities;

import lombok.Data;

@Data
public class LoginDTO {

    //user email
    private String email;
    //user psw
    private String password;
}
