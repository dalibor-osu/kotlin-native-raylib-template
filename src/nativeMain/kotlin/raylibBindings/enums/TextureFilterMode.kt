package raylibBindings.enums

enum class TextureFilterMode(val mode: Int) {
    FilterPoint(0),
    FilterBilinear(1),
    FilterTrilinear(2),
    FilterAnisotropic4x(3),
    FilterAnisotropic8x(4),
    FilterAnisotropic16x(5)
}