package com.co.hexagonal.application.usecases;


import com.co.hexagonal.domain.models.Task;
import com.co.hexagonal.domain.ports.in.UpdateTaskUseCase;
import com.co.hexagonal.domain.ports.out.TaskRepositoryPort;

import java.util.Optional;

public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public UpdateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updatedTask) {
        return taskRepositoryPort.update(updatedTask);
    }
}
