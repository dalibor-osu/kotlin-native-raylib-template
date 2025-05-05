package raylibBindings.enums

enum class PixelFormat(val format: Int) {
    UncompressedGrayscale(1),
    UncompressedGrayAlpha(2),
    UncompressedR5g6b5(3),
    UncompressedR8g8b8(4),
    UncompressedR5g5b5a1(5),
    UncompressedR4g4b4a4(6),
    UncompressedR8g8b8a8(7),
    UncompressedR32(8),
    UncompressedR32g32b32(9),
    UncompressedR32g32b32a32(10),
    CompressedDxt1Rgb(11),
    CompressedDxt1Rgba(12),
    CompressedDxt3Rgba(13),
    CompressedDxt5Rgba(14),
    CompressedEtc1Rgb(15),
    CompressedEtc2Rgb(16),
    CompressedEtc2EacRgba(17),
    CompressedPvrtRgb(18),
    CompressedPvrtRgba(19),
    CompressedAstc4x4Rgba(20),
    CompressedAstc8x8Rgba(21)
}