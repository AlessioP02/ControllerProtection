package com.example.ControllerProtection.salary.entities;

import co.develhope.loginDemo.user.entities.User;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private long amount;

    @OneToOne
    private User user;
}
