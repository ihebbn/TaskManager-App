package iheb.example.taskmanagerapp.Resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import iheb.example.taskmanagerapp.Entity.Task;
import iheb.example.taskmanagerapp.Service.TaskService;

import java.util.List;

public class QueryResolver implements GraphQLQueryResolver {
    private final TaskService taskService;

    public QueryResolver(TaskService taskService) {
        this.taskService = taskService;
    }

    public List<Task> retrieveAllTasks() {
        return taskService.retrieveAllTasks();
    }
}
