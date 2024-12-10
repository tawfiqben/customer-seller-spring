package lu.luxbank.ecommercebackend.security;

import lu.luxbank.ecommercebackend.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//@EnableWebSecurity
//@Configuration
public class SecurityConfig {

    private final UserRepository  userRepository;

    public SecurityConfig(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

/*
    TO DO: override configure + add JwtAuthTokenFilter + EntryPoint
    protected void configure(HttpSecurity http) throws Exception {
        http.cors().csrf().disable()
            .authorizeRequests()
            .antMathers("/admin/).hasRole("ADMIN)
            .antMathers("/admin/**).hasRole("ADMIN)
            .antMathers("/users/**).hasAnyRole("CUSTOMER","SELLER")
            .anyRequest().authentificated()
            .addFilterBefore(jwtAuth....)
      }

*/
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
}
