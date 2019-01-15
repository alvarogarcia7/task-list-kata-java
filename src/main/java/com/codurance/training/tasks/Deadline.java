package com.codurance.training.tasks;

import java.util.Objects;

public class Deadline {
    private String value;

    public Deadline(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deadline deadline = (Deadline) o;
        return Objects.equals(value, deadline.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Deadline{" +
                "value='" + value + '\'' +
                '}';
    }
}
