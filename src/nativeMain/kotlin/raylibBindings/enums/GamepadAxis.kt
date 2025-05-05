package raylibBindings.enums

enum class GamepadAxis(val code: Int) {
    GamepadAxisUnknown(0),
    GamepadAxisLeftX(1),
    GamepadAxisLeftY(2),
    GamepadAxisRightX(3),
    GamepadAxisRightY(4),
    GamepadAxisLeftTrigger(5),
    GamepadAxisRightTrigger(6)
}