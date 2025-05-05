package raylibBindings.enums

enum class TraceLogType(val value: Int) {
    LogAll(0),
    LogTrace(1),
    LogDebug(2),
    LogInfo(3),
    LogWarning(4),
    LogError(5),
    LogFatal(6),
    LogNone(7)
}