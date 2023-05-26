package app.itochan.handreview.data

data class Card(val suit: Suit, val rank: Rank)

enum class Suit {
  CLUB, DIAMOND, HEART, SPADE
}

enum class Rank {
  ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
}
