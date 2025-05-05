import kotlinx.cinterop.cValue
import raylib.*

@kotlinx.cinterop.ExperimentalForeignApi
fun main() {
    InitWindow(800, 450, "Hello, Raylib!")

    SetTargetFPS(60)

    while (!WindowShouldClose()) {
        //region Update
        // Update your variables here:
        //endregion

        //region Drawing
        BeginDrawing();

        ClearBackground(cValue {
            r = 0u
            g = 0u
            b = 0u
            a = 255u
        })
        DrawText("Hello from Kotlin/Native running Raylib!", 10, 10, 20, cValue {
            r = 250u
            g = 250u
            b = 250u
            a = 255u
        })

        EndDrawing()
        //endregion
    }

    CloseWindow()
}