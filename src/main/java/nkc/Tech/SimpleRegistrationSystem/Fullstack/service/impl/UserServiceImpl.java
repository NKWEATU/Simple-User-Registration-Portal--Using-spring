package nkc.Tech.SimpleRegistrationSystem.Fullstack.service.impl;

import nkc.Tech.SimpleRegistrationSystem.Fullstack.dto.UserDto;
import nkc.Tech.SimpleRegistrationSystem.Fullstack.entity.User;
import nkc.Tech.SimpleRegistrationSystem.Fullstack.mapper.UserMapper;
import nkc.Tech.SimpleRegistrationSystem.Fullstack.repository.UserRepository;
import nkc.Tech.SimpleRegistrationSystem.Fullstack.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    // Corrected constructor
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createUser(UserDto userDto) {
        User user = UserMapper.mapToUser(userDto);
        userRepository.save(user);
    }
}
