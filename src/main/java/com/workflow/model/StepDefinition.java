package com.workflow.model;

import java.time.Duration;
import java.util.Map;

public record StepDefinition(
    String stepId,
    String handlerClass,
    int maxRetries,
    Duration timeout,
    Map<String, String> parameters
) {
    public StepDefinition(String stepId, String handlerClass) {
        this(stepId, handlerClass, 3, Duration.ofSeconds(30), Map.of());
    }
}

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers

// Step definition helpers
