package raylibBindings.enums

enum class MaterialMapType(val type: Int) {
    MapAlbedo(0), // Also MAP_DIFFUSE
    MapMetalness(1), // Also MAP_SPECULAR
    MapNormal(2),
    MapRoughness(3),
    MapOcclusion(4),
    MapEmission(5),
    MapHeight(6),
    MapCubemap(7),
    MapIrradiance(8),
    MapPrefilter(9),
    MapBrdf(10)
}