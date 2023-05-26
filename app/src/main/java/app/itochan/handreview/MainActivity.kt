package app.itochan.handreview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import app.itochan.handreview.ui.theme.PokerHandReviewAppTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      PokerHandReviewAppTheme {
        HandReviewScreen()
      }
    }
  }
}

@Composable
fun HandReviewScreen() {
  Column(modifier = Modifier.fillMaxSize()) {
    Button(onClick = { /*TODO*/ }) {
      Text(text = "Choose card")
    }
  }
}

@Preview(showBackground = true)
@Composable
fun HandReviewPreview() {
  PokerHandReviewAppTheme {
    HandReviewScreen()
  }
}