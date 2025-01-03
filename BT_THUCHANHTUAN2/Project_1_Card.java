public class Project_1_Card {
    private final String face;
    private final String suit;

    public Project_1_Card(String cardFace, String cardSuit) {
        this.face=cardFace;
        this.suit=cardSuit;
    }

    public String toString(){
        return face + " of " + suit;
    }
}