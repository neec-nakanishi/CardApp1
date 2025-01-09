public class Player {

    Card turn(Card[] cards) {
        int i = (int)(Math.random() * cards.length);
        cards[i].open();
        return cards[i];
    }
}
