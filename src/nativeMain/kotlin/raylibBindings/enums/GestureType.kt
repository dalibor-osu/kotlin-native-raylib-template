package raylibBindings.enums

enum class GestureType(val mask: Int) {
    GestureNone(0),
    GestureTap(1),
    GestureDoubleTap(2),
    GestureHold(4),
    GestureDrag(8),
    GestureSwipeRight(16),
    GestureSwipeLeft(32),
    GestureSwipeUp(64),
    GestureSwipeDown(128),
    GesturePinchIn(256),
    GesturePinchOut(512)
}