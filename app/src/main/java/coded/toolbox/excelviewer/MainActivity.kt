package coded.toolbox.excelviewer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import coded.toolbox.excelviewer.ui.theme.ExcelViewerTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ExcelViewerTheme {
                EnterAlwaysTopAppBar()
            }
        }
    }
}
