package raylibBindings.enums

enum class ConfigFlag(val value: Int) {
    FlagReserved(1),
    FlagFullscreenMode(2),
    FlagWindowResizable(4),
    FlagWindowUndecorated(8),
    FlagWindowTransparent(16),
    FlagMsaa4xHint(32),
    FlagVsyncHint(64),
    FlagWindowHidden(128),
    FlagWindowAlwaysRun(256)
}