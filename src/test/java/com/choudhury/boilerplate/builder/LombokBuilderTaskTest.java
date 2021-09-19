package com.choudhury.boilerplate.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LombokBuilderTaskTest {

    @Test
    void exceptionIsThrownIfMandatoryValuesMissed() {
        NullPointerException exceptionThrown = assertThrows(NullPointerException.class, () -> LombokBuilderTask.builder().done(true).build());
        Assertions.assertTrue(exceptionThrown.getMessage().contains("taskName is marked non-null but is null"));
    }

    @Test
    void allOkIfMandatoryValuesPresent() {
        LombokBuilderTask myTask = LombokBuilderTask.builder().taskName("my task").done(true).build();
        assertEquals("my task", myTask.getTaskName());
        assertEquals(true, myTask.isDone());

    }

}