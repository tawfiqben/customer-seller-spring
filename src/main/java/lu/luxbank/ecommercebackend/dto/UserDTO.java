package lu.luxbank.ecommercebackend.dto;

import lombok.*;
import lu.luxbank.ecommercebackend.enums.Role;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class UserDTO {

    private String username;
    private String password;
    private String email;

}
