package lu.luxbank.ecommercebackend.controller;

import lu.luxbank.ecommercebackend.entity.User;
import lu.luxbank.ecommercebackend.enums.Role;
import lu.luxbank.ecommercebackend.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class UserConroller {

    private final UserService userService;

    //DI via constructor recommended by Vmware
    public UserConroller(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/users")
    public List<User> allUser() {
        return userService.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(path="/users", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public User saveUser(@RequestParam String username, String password, String email, String role) {
        return userService.saveUser(username, password, email, role); //TO DO: utiliser DTO et  BCrypthpassword avant l'enregistrement
    }

    @GetMapping(path = "/users/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @GetMapping("/usersByUsername/{username}")
    public User getUserByUsername(@PathVariable String username) {
        return userService.findByUsername(username);
    }

    @GetMapping("/usersByRole")
    public List<User> getUserByRole(@RequestParam Role role) {
        return userService.findByRole(role);
    }



    //TODO: add validator

}
