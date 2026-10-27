import korlibs.korge.Korge
import korlibs.korge.view.*
import korlibs.image.color.Colors

suspend fun main() = Korge(windowWidth = 800, windowHeight = 600, backgroundColor = Colors["#2b2b2b"]) {

	text("Mustafa says 'Hi!'", textSize = 32.0, color = Colors.WHITE).xy(250.0, 80.0)
    
    circle(40.0, Colors.YELLOW).xy(200.0, 150.0)

    solidRect(100.0, 100.0, Colors.GREEN).xy(400.0, 200.0)

    solidRect(180.0, 80.0, Colors.BLUE).xy(600.0, 350.0)
}

// .\gradlew runJvm
