package nkc.Tech.SimpleRegistrationSystem.Fullstack.controller;

import jakarta.validation.Valid;
import nkc.Tech.SimpleRegistrationSystem.Fullstack.dto.UserDto;
import nkc.Tech.SimpleRegistrationSystem.Fullstack.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Show the user registration form
    @GetMapping("/user/new")
    public String showUserForm(Model model) {
        model.addAttribute("user", new UserDto());
        return "create_user"; // name of your Thymeleaf HTML template
    }

    // Handle form submission
    @PostMapping("/users")
    public String saveUser(@Valid @ModelAttribute("user") UserDto user,
                           BindingResult result,
                           RedirectAttributes redirectAttributes,
                           Model model) {
        if (result.hasErrors()) {
            model.addAttribute("user", user);
            return "create_user";
        }

        userService.createUser(user);
        redirectAttributes.addFlashAttribute("message", "User registered successfully!");
        return "redirect:/user/new";
    }
}
