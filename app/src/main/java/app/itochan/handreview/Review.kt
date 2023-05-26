package app.itochan.handreview

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import app.itochan.handreview.ui.theme.PokerHandReviewAppTheme

@Composable
fun Review(navController: NavHostController) {
  val playerA = "Player A"
  val playerB = "Player B"
  val positionBtn = "BTN"
  val positionBb = "BB"

  PokerHandReviewAppTheme {
    Row(
      modifier = Modifier.fillMaxSize()
    ) {
      Column(
        modifier = Modifier
          .weight(1f)
          .padding(4.dp)
      ) {
        Text(
          modifier = Modifier.padding(bottom = 8.dp),
          text = "Preflop"
        )
        Action(
          name = playerA,
          position = positionBtn,
          action = "Raise 2"
        )
        Action(
          name = playerB,
          position = positionBb,
          action = "Call 1.50"
        )
      }
      Divider(
        modifier = Modifier
          .width(1.dp)
          .fillMaxHeight()
      )
      Column(
        modifier = Modifier
          .weight(1f)
          .padding(4.dp)
      ) {
        Text(
          modifier = Modifier.padding(bottom = 8.dp),
          text = "Flop"
        )
        Action(
          name = playerA,
          position = positionBtn,
          action = "Check"
        )
        Action(
          name = playerB,
          position = positionBb,
          action = "Bet 2.50"
        )
        Action(
          name = playerA,
          position = positionBtn,
          action = "Call 2.50"
        )
      }
      Divider(
        modifier = Modifier
          .width(1.dp)
          .fillMaxHeight()
      )
      Column(
        modifier = Modifier
          .weight(1f)
          .padding(4.dp)
      ) {
        Text(
          modifier = Modifier.padding(bottom = 8.dp),
          text = "Turn"
        )
        Action(
          name = playerA,
          position = positionBtn,
          action = "Check"
        )
        Action(
          name = playerB,
          position = positionBb,
          action = "Bet 5"
        )
        Action(
          name = playerA,
          position = positionBtn,
          action = "Raise 15"
        )
        Action(
          name = playerB,
          position = positionBb,
          action = "Call 10"
        )
      }
      Divider(
        modifier = Modifier
          .width(1.dp)
          .fillMaxHeight()
      )
      Column(
        modifier = Modifier
          .weight(1f)
          .padding(4.dp)
      ) {
        Text(
          modifier = Modifier.padding(bottom = 8.dp),
          text = "River"
        )
        Action(
          name = playerA,
          position = positionBtn,
          action = "Bet 30"
        )
        Action(
          name = playerB,
          position = positionBb,
          action = "Call 30"
        )
        Action(
          name = playerA,
          position = positionBtn,
          action = "6d 8d"
        )
        Action(
          name = playerB,
          position = positionBb,
          action = "Jd Kd"
        )
      }
    }
  }
}

@Composable
private fun Action(
  name: String,
  position: String,
  action: String
) {
  Column(
    modifier = Modifier.padding(bottom = 8.dp)
  ) {
    Text(
      text = "$name [$position]",
      fontSize = 12.sp
    )
    Text(
      text = action,
      fontSize = 12.sp
    )
  }
}
