package nkc.Tech.SimpleRegistrationSystem.Fullstack.repository;

import nkc.Tech.SimpleRegistrationSystem.Fullstack.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

