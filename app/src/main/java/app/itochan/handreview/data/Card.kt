package app.itochan.handreview.data

data class Card(val suit: Suit, val rank: Rank)

enum class Suit {
  CLUB, DIAMOND, HEART, SPADE
}

enum class Rank {
  ACE, KING, QUEEN, JACK, TEN, NINE, EIGHT, SEVEN, SIX, FIVE, FOUR, THREE, TWO
}
