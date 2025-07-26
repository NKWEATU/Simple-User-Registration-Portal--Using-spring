package nkc.Tech.SimpleRegistrationSystem.Fullstack.mapper;

import nkc.Tech.SimpleRegistrationSystem.Fullstack.dto.UserDto;
import nkc.Tech.SimpleRegistrationSystem.Fullstack.entity.User;

public class UserMapper {

    private UserMapper() {
        // prevent instantiation
    }

    public static UserDto mapToUserDto(User user) {
        return new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getPhoneNumber(),
                user.getEmail()
        );
    }

    public static User mapToUser(UserDto userDto) {
        return new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getPhoneNumber(),
                userDto.getEmail()
        );
    }
}
