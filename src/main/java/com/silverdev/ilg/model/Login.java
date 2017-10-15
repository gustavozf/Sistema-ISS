package com.silverdev.ilg.model;

import com.silverdev.ilg.model.enums.Role;

import javax.persistence.*;

/**
 * Created by narcizo on 05/10/17.
 */
@Entity
public class Login {
    @Id
    @Column(name = "login_username")
    private String username;

    @Column(name = "login_password")
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "login_acesso")
    private Role acesso;

}