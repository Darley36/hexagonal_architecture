package com.co.hexagonal.domain.ports.in;

import com.co.hexagonal.domain.models.Task;

public interface CreateTaskUseCase {
    Task createTask(Task task);
}
