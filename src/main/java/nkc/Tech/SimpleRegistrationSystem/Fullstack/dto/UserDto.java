package nkc.Tech.SimpleRegistrationSystem.Fullstack.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long id;

    @NotEmpty(message = "First name should not be empty")
    private String firstName;

    @NotEmpty(message = "Last name should not be empty")
    private String lastName;

    @NotEmpty(message = "Phone number should not be empty")
    private String phoneNumber;

    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Enter a valid email address")
    private String email;
}
