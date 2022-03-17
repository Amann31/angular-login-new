package com.example.loginregistration.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "credentials_table")
public class User {
    @Id
    private Integer id;
    private String email;
    private String userName;
    private String password;
}
