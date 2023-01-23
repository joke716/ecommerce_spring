package com.teddy.ecommerce_spring.service;

import com.teddy.ecommerce_spring.api.controller.model.RegistrationBody;
import com.teddy.ecommerce_spring.exception.UserAlreadyExistsException;
import com.teddy.ecommerce_spring.model.LocalUser;
import com.teddy.ecommerce_spring.model.dao.LocalUserDAO;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private LocalUserDAO localUserDAO;

    public UserService(LocalUserDAO localUserDAO) {
        this.localUserDAO = localUserDAO;
    }

    public LocalUser registerUser(RegistrationBody registrationBody) throws UserAlreadyExistsException {
        if (localUserDAO.findByEmailIgnoreCase(registrationBody.getEmail()).isPresent()
            || localUserDAO.findByUsernameIgnoreCase(registrationBody.getUsername()).isPresent()) {
            throw new UserAlreadyExistsException();
        }
        LocalUser user = new LocalUser();
        user.setEmail(registrationBody.getEmail());
        user.setUsername(registrationBody.getUsername());
        user.setFirstName(registrationBody.getFirstName());
        user.setLastName(registrationBody.getLastName());
        user.setPassword(registrationBody.getPassword());;
        return localUserDAO.save(user);
    }

}
