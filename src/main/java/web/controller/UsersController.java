package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.servise.UserServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UsersController {

    private final UserServiceImp userServiceImp;

    @Autowired
    public UsersController(UserServiceImp userServiceImp) {
        this.userServiceImp = userServiceImp;
    }

    @GetMapping("/")
    public String showUsersTable(Model model){
        model.addAttribute("users", userServiceImp.getUsersList());
        return "users";
    }
    @GetMapping(value = "/user")
    public String printWelcome(ModelMap model) {

        return "users";
    }

}
