package org.apache.kafka.common.config;

import java.util.Objects;

public class ConfigValue {

    private final String name;
    private final Object value;
    private final boolean visible;

    public ConfigValue(String name, Object value) {
        this.name = name;
        this.value = value;
        this.visible = true;
    }

    public String name() {
        return name;
    }

    public Object value() {
        return value;
    }

    public boolean visible() {
        return visible;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConfigValue that)) return false;
        return visible == that.visible && Objects.equals(name, that.name) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, visible);
    }

    @Override
    public String toString() {
        return "ConfigValue{" +
               "name='" + name + '\'' +
               ", value='" + value + '\'' +
               ", visible=" + visible +
               '}';
    }
}
