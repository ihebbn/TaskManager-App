package iheb.example.taskmanagerapp.Service;

import iheb.example.taskmanagerapp.Entity.Task;
import iheb.example.taskmanagerapp.Repository.TaskRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;


    public List<Task> retrieveAlltasks() {
        return taskRepository.findAll();
    }

    public Task addTask(Task task) {
        return taskRepository.save(task);
    }

    public void removeTask(Long idTask) {

        taskRepository.deleteById(idTask);
    }
}
