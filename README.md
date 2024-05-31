# Condition is always false

## Setup

 - JDK 17+
 - Apache Maven

## Just try this

```shell
mvn compile
```

You should see:

```shell
[INFO] --- kotlin:2.0.0:compile (compile) @ kotlin-200-bug-questionmark ---
[ERROR] warnings found and -Werror specified
[WARNING] /Users/fbiville/workspace/kotlin-200-bug-questionmark/src/main/kotlin/io/github/fbiville/Validators.kt: (14, 40) Condition is always 'false'.
```

## ... except for Kotlin < 2.0.0?

This does not happen with 1.9.24:

```shell
mvn compile -Dkotlin.version=1.9.24
```
