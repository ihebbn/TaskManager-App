package iheb.example.taskmanagerapp.Repository;

import iheb.example.taskmanagerapp.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository	extends JpaRepository<Task,Long> {
}
