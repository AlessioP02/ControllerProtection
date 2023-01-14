package com.example.ControllerProtection.user.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Role {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    private String name;

    private String description;
}
