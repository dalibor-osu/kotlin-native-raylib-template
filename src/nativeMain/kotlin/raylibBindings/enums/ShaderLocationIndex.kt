package raylibBindings.enums

enum class ShaderLocationIndex(val index: Int) {
    LocVertexPosition(0),
    LocVertexTexcoord01(1),
    LocVertexTexcoord02(2),
    LocVertexNormal(3),
    LocVertexTangent(4),
    LocVertexColor(5),
    LocMatrixMvp(6),
    LocMatrixModel(7),
    LocMatrixView(8),
    LocMatrixProjection(9),
    LocVectorView(10),
    LocColorDiffuse(11),
    LocColorSpecular(12),
    LocColorAmbient(13),
    LocMapAlbedo(14), // Also LOC_MAP_DIFFUSE
    LocMapMetalness(15), // Also LOC_MAP_SPECULAR
    LocMapNormal(16),
    LocMapRoughness(17),
    LocMapOcclusion(18),
    LocMapEmission(19),
    LocMapHeight(20),
    LocMapCubemap(21),
    LocMapIrradiance(22),
    LocMapPrefilter(23),
    LocMapBrdf(24)
}