package lu.luxbank.ecommercebackend.service;

import jakarta.transaction.Transactional;
import lu.luxbank.ecommercebackend.entity.User;
import lu.luxbank.ecommercebackend.enums.Role;
import lu.luxbank.ecommercebackend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User saveUser(String username, String password, String email, String role) { //TO DO: replace param by DTO
            User user = User.builder()
                    .username(username)
                    .password(password)
                    .email(email)
                    .role(Role.OTHER) //TO DO: recuperer le role depuis le front en fonction de la page sign up
                    .build();
        return userRepository.save(user);
    }
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public List<User> findByRole(Role role) {
        return userRepository.findByRole(role);
    }


}
