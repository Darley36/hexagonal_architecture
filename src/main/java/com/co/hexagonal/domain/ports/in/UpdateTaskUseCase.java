package com.co.hexagonal.domain.ports.in;

import com.co.hexagonal.domain.models.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {
    Optional<Task> updateTask(Long id, Task updateTask);
}
