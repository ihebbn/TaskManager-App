package iheb.example.taskmanagerapp.Resolver;

import graphql.kickstart.tools.GraphQLMutationResolver;
import iheb.example.taskmanagerapp.Entity.Priority;
import iheb.example.taskmanagerapp.Entity.Status;
import iheb.example.taskmanagerapp.Entity.Task;
import iheb.example.taskmanagerapp.Service.TaskService;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class MutationResolver implements GraphQLMutationResolver {
    private final TaskService taskService;

    public MutationResolver(TaskService taskService) {
        this.taskService = taskService;
    }

    public Task addTask(String title, String description, Date dueDate, Priority priority, Status status) {
        Task task = new Task();
        task.setTitle(title);
        task.setDescription(description);
        task.setDueDate(dueDate);
        task.setPriority(priority);
        task.setStatus(status);
        return taskService.addTask(task);
    }

    public boolean removeTask(long id) {
        taskService.removeTask(id);
        return true;
    }
}
