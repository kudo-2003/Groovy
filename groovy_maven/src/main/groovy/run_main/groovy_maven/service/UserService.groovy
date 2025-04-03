package run_main.groovy_maven.service

import org.springframework.stereotype.Service
import run_main.groovy_maven.entity.User
import run_main.groovy_maven.repository.UserRepository

@Service
class UserService {
    final UserRepository userRepository

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository
    }

    List<User> getAllUsers() {
        return userRepository.findAll()
    }

    User saveUser(User user) {
        return userRepository.save(user)
    }
}
