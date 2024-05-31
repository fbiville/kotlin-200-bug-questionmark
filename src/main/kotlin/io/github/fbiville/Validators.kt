package io.github.fbiville

import org.apache.kafka.common.config.Config

object Validators {

    fun Config.validateNonEmptyIfVisible(name: String) {
        this.configValues()
            .first { it.name() == name }
            .let { config ->
                if (config.visible() &&
                    (when (val value = config.value()) {
                        is Int? -> value == null
                        is Boolean? -> value == null
                        is String? -> value.isNullOrEmpty()
                        is List<*>? -> value.isEmpty()
                        else ->
                            throw IllegalArgumentException(
                                "unexpected value '$value' for configuration $name"
                            )
                    })
                ) {
                    System.err.println("Invalid value for configuration $name: Must not be blank.")
                }
            }
    }
}
