package raylibBindings.enums

enum class TextureWrapMode(val mode: Int) {
    WrapRepeat(0),
    WrapClamp(1),
    WrapMirrorRepeat(2),
    WrapMirrorClamp(3)
}