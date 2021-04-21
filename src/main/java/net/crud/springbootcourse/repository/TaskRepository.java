package net.crud.springbootcourse.repository;


import net.crud.springbootcourse.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
