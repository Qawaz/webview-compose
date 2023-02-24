import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.Modifier
import com.wakaztahir.common.DisplayWebView
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    onWasmReady {
        BrowserViewportWindow("Code Editor") {
            MaterialTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    DisplayWebView()
                }
            }
        }
    }
}


