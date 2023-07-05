package com.co.hexagonal.application.usecases;

import com.co.hexagonal.domain.models.AdditionalTaskInfo;
import com.co.hexagonal.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.co.hexagonal.domain.ports.out.ExternalServicePort;

public class GetAdditionalTaskInfoUseCaseImpl implements GetAdditionalTaskInfoUseCase {

    private final ExternalServicePort externalServicePort;

    public GetAdditionalTaskInfoUseCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long taskId) {
        return externalServicePort.getAdditionalTaskInfo(taskId);
    }
}
