package com.choudhury.boilerplate.builder;

public class ClassicBuilderTask {
    private String taskName;
    private boolean done;
    //private String description;
    
    
    ClassicBuilderTask(String taskName, boolean done){
        this.taskName = taskName;
        this.done = done;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String taskName;
        private boolean done;

        Builder() {
        }

        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        public Builder done(boolean done) {
            this.done = done;
            return this;
        }

        public LombokBuilderTask build() {
            return new LombokBuilderTask(taskName, done);
        }

        public String toString() {
            return "ClassicBuilderTask.Builder(taskName=" + this.taskName + ", done=" + this.done + ")";
        }
    }
}
