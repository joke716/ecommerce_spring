package com.teddy.ecommerce_spring.api.controller.model;

import javax.validation.constraints.*;

public class RegistrationBody {
    /** The username. */
    @NotNull
    @NotBlank
    @Size(min=3, max=255)
    private String username;

    @NotNull
    @NotBlank
    @Email
    private String email;

    @NotNull
    @NotBlank
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{6,}$")
    @Size(min=6, max=32)
    private String password;

    /** The first name. */
    @NotNull
    @NotBlank
    private String firstName;
    /** The last name. */
    @NotNull
    @NotBlank
    private String lastName;

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
