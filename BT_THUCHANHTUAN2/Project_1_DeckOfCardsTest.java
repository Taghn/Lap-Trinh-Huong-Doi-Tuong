public class Project_1_DeckOfCardsTest {
    public static void main(String[] args) {
        Project_1_DeckOfCards myDeckOfCards = new Project_1_DeckOfCards();
        myDeckOfCards.shuffle();

        for(int i=1; i<=52; i++){
            System.out.printf("%-19s", myDeckOfCards.dealCard());
            if(i%4==0){
                System.out.println();
            }
        }
    }
}
