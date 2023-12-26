package net.todomanagement.app.todomanagement.repository;

import net.todomanagement.app.todomanagement.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
