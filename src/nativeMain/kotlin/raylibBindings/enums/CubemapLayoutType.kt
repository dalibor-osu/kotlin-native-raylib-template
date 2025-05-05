package raylibBindings.enums

enum class CubemapLayoutType(val layout: Int) {
    CubemapAutoDetect(0),
    CubemapLineVertical(1),
    CubemapLineHorizontal(2),
    CubemapCrossThreeByFour(3),
    CubemapCrossFourByThree(4),
    CubemapPanorama(5)
}