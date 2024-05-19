package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.models.User;
import web.servise.UserService;

@Controller
@RequestMapping
public class UsersController {

    private final UserService userService;
    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }
    //главная страница
    @GetMapping("/")
    public String showUsersTable(Model model){
        model.addAttribute("users", userService.getUsersList());
        return "users";
    }
    //новый пользователь
    @GetMapping("/new")
    public String showUserForm(@ModelAttribute("user") User user){
        return "userForm";
    }
    @PostMapping()
    public String processUserForm(@ModelAttribute("user") User user){
        userService.createUser(user);
        return "redirect:/";
    }
    //изменение пользователя
    @GetMapping("edit")
    public String showUsersForm(@RequestParam ("id") Long userId, Model model) {
        model.addAttribute("user", userService.getUser(userId));
        return "editForm";
    }
    @PostMapping("/userUpdate")
    public String processEditForm(@ModelAttribute User user){
        userService.updateUser(user);
        return "redirect:/";
    }
    //удаление
    @GetMapping("delete")
    public String processDeleteForm(@RequestParam("id") Long userId) {
        userService.deleteUser(userId);
        return "redirect:/";
    }
}
