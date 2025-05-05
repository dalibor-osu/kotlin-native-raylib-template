package raylibBindings.enums

enum class ShaderUniformDataType(val type: Int) {
    UniformFloat(0),
    UniformVec2(1),
    UniformVec3(2),
    UniformVec4(3),
    UniformInt(4),
    UniformIVec2(5),
    UniformIVec3(6),
    UniformIVec4(7),
    UniformSampler2D(8)
}