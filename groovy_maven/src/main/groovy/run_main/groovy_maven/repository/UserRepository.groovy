package run_main.groovy_maven.repository

import org.springframework.data.jpa.repository.JpaRepository
import run_main.groovy_maven.entity.User

interface UserRepository extends JpaRepository<User, Long> {}
