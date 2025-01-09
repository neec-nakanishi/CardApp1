public class Game {

    Player p;
    Card[] cards;

    Game() {
        p = new Player();

        cards = new Card[52];
        String[] marks = {"♠︎", "❤︎", "♦︎", "♣︎"};
        for (int i=0 ; i<4 ; i++) {
            for (int j=0 ; j<13 ; j++) {
                cards[i*13+j] = new Card();
                cards[i*13+j].mark = marks[i];
                cards[i*13+j].number = j+1;
            }
        }
    }
    
    void start() {
        Card card = p.turn(cards);
        judge(card);
    }

    void judge(Card card){
        if (card.number>=10) {
            System.out.println("勝ち！！！");
        } else {
            System.out.println("負け");
        }
    }

}
