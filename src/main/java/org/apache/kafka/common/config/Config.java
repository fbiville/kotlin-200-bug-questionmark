package org.apache.kafka.common.config;

import java.util.List;

public class Config {

    private final List<ConfigValue> configValues;

    public Config(List<ConfigValue> configValues) {
        this.configValues = configValues;
    }

    public List<ConfigValue> configValues() {
        return configValues;
    }

}
