package com.codeup.springblog.controllers;

import com.codeup.springblog.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/users/all")
    public String getAllUsers(
            Model model
    ){
        List<User> listOfUsers = new ArrayList<>();

        listOfUsers.add(new User("Jonathan", "Sanchez"));
        listOfUsers.add(new User("Sergio", "Davila"));
        listOfUsers.add(new User("Jake", "Chadwell"));
        listOfUsers.add(new User("Darius", "Brown"));

        model.addAttribute("users", listOfUsers);

        return "users";
    }

    @GetMapping("/users")
    public String getTheStringUser(
            Model model
    ){
        model.addAttribute("user", new User("Hannah", "Sanchez"));
        return "users";
    }
}
