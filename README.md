# Kotlin/Native Raylib Template
This template aims to help you to get started with Raylib using Kotlin/Native. This is basically an updated fork of [kotlin-native-raylib-starter](https://github.com/LeHaine/kotlin-native-raylib-starter) and I also plan to add some quality-of-life improvements to help you.

## How to use this template
Simply fork, download, or create a new project using this repository. After building and running the project, you should see a small window appear. There shouldn't be any dependencies beyond the standard Kotlin libraries.

## Quality-of-life code
There are currently some QoL classes to help you with Raylib's enums. Feel free to delete any code you don't want to use.

Raylib enums vs. enum classes example:
```kotlin
if (IsKeyDown(KEY_ENTER.toInt())) { ... }  // using Raylib enum value
if (IsKeyDown(KeyboardKey.KeyEnter.code)) { ... } // using enum class value
```

## Disclaimer
This has only been tested on an x64 Linux machine. If you run into any issues, feel free to open a pull request with a fix or submit an issue.
