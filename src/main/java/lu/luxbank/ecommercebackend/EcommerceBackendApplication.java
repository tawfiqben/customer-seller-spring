package lu.luxbank.ecommercebackend;

import lu.luxbank.ecommercebackend.entity.User;
import lu.luxbank.ecommercebackend.enums.Role;
import lu.luxbank.ecommercebackend.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommerceBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceBackendApplication.class, args);
	}

	//To inject : BCryptPasswordEncoder bCryptPasswordEncoder

	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository) {
		return args -> {
			//Save admin profile
			userRepository.save(User.builder()
					.username("tbenayad")
					//.password(bCryptPasswordEncoder.encode("admin!1234"))
					.password("admin!1234")
					.email("admin@email.com")
					.role(Role.ADMIN)
					.build());
			//Save 3 Customer
			userRepository.save(User.builder()
					.username("customer01")
					//.password(bCryptPasswordEncoder.encode("customer01!1234"))
					.password("customer01!1234")
					.email("customer01@email.com")
					.role(Role.CUSTOMER)
					.build());
			userRepository.save(User.builder()
					.username("customer02")
					.password("customer02!1234")
					.email("customer02@email.com")
					.role(Role.CUSTOMER)
					.build());
			userRepository.save(User.builder()
					.username("customer03")
					.password("customer03!1234")
					.email("customer03@email.com")
					.role(Role.CUSTOMER)
					.build());

			//Save 2 Seller
			userRepository.save(User.builder()
					.username("seller01")
					.password("seller01!1234")
					.email("seller01@email.com")
					.role(Role.SELLER)
					.build());
			userRepository.save(User.builder()
					.username("seller02")
					.password("seller01!1234")
					.email("seller02@email.com")
					.role(Role.SELLER)
					.build());

		};
	}
}
