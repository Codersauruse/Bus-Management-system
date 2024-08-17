package com.example.BSMS.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "Users")
public class Users {
    @Id
    @Column(name = "user_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    @Column(name = "user_name", length = 100, nullable = false)
    private String username;

    @Column(name = "email" ,length = 100,nullable = false)
    private String email;

    @Column(name = "password", length = 100, nullable = false)
    private String password;


}
