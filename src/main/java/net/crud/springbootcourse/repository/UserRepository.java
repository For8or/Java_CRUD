package net.crud.springbootcourse.repository;


import net.crud.springbootcourse.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
