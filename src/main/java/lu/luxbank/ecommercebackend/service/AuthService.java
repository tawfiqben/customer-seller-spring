package lu.luxbank.ecommercebackend.service;

import jakarta.transaction.Transactional;
import lu.luxbank.ecommercebackend.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AuthService {

    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //TO DO: sign up & login service


}
