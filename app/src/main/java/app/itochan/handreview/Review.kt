package app.itochan.handreview

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import app.itochan.handreview.ui.theme.PokerHandReviewAppTheme

@Composable
fun Review(navController: NavHostController) {
  PokerHandReviewAppTheme {
    Column(modifier = Modifier.fillMaxSize()) {
      Button(onClick = { navController.navigate("choose_card") }) {
        Text(text = "Choose card")
      }
    }
  }
}
