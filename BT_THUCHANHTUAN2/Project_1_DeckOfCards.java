import java.security.SecureRandom;

public class Project_1_DeckOfCards {
    //khai bao so la bai 
    private static final int NUMBER_OF_CARDS = 52;
    //khai bao bien ngau nhien 
    private static final SecureRandom randomNumber = new SecureRandom();
    
    private Project_1_Card[] desk = new Project_1_Card[NUMBER_OF_CARDS];
    private int currentCard = 0;

    //khoi tao 
    public Project_1_DeckOfCards() {
        String[] faces= {"At","Hai","Ba","Bon","Nam","Sau","Bay","Tam","Chin","Muoi","J","Q","K"};
        String[] suit= {"Co","Ro","Bich","Nhep"};

        //dest[52] = card(13*4)
        for(int count=0; count<desk.length;count++) {
            desk[count] = new Project_1_Card(faces[count % 13],suit[count/13]);
        }
    }

    //giai thuat chia bai 
    public void shuffle(){
        //giai thuat buoc 3 chay 1 toi 52
        for(int first=0;first<desk.length;first++) {
            int second = randomNumber.nextInt(NUMBER_OF_CARDS);

            Project_1_Card temp = desk[first];
            desk[first]=desk[second];
            desk[second]=temp;
        }
    }

    //tra ve gia tri sau khi chia 
    //buoc 4 
    public Project_1_Card dealCard(){
        if(currentCard<desk.length)
        {
            return desk[currentCard++];
        }
        else
        {
            return null;
        }
    }
}
