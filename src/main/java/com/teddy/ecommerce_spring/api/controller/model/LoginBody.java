package com.teddy.ecommerce_spring.api.controller.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class LoginBody {

    /** The username to log in with. */
    @NotNull
    @NotBlank
    private String username;
    /** The password to log in with. */
    @NotNull
    @NotBlank
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
