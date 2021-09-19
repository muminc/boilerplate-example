package com.choudhury.boilerplate.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Builder
@Getter
public class LombokBuilderTask {
    @NonNull
    String taskName;
    boolean done;


}
