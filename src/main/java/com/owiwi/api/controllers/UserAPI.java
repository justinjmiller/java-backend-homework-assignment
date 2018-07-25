package com.owiwi.api.controllers;

import com.owiwi.model.User;
import com.owiwi.repositories.base.ConnectionRepository;
import com.owiwi.repositories.base.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
@RequestMapping("/api/users/")
public class UserAPI
{
    private static UserRepository users = new UserRepository();
    private static ConnectionRepository connetions = new ConnectionRepository();

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<User> getUserById(@PathVariable Long id)
    {
        User user = users.findById(id);
        return ResponseEntity.ok(user);
    }
}

