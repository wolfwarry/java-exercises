import java.util.*;
public class Card {

    private int[] carta;
    public Card(int []carta) {

        this.carta = carta;

        Random random = new Random();
        carta[0] = random.nextInt(13);
        carta[1] = random.nextInt(4);
    }
}
