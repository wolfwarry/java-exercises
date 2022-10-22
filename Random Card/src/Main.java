import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //init. variables
        int [] carta1 = new int[2];
        int [] carta2 = new int[2];
        String FinalCard1;
        String FinalCard2;
        boolean Same;
        int i=1;
        int j=2;
        int s;
        int cycle=1;

        /*
        //2 cycle
        //1) for let the user repeat the function
        //2)check if the cards are the same or not
        */
        do {
            do {
                //creation of the 2 obj
                new Card(carta1);
                new Card(carta2);

                Same = Arrays.equals(carta1, carta2);//control if the 2 cards are the same
                FinalCard1 = Converter.converter(carta1);//convert in string
                FinalCard2 = Converter.converter(carta2);//convert in string

                if (Same)//if same print the same
                    break;

                //print the value of the 2 cards that are different
                System.out.println("Card " + i + ": " + FinalCard1);
                System.out.println("Card " + j + ": " + FinalCard2);
                System.out.println("----------------------");
                i+=2;
                j+=2;

            } while (true);

            //print the value
            System.out.println("Card " + i + ":" + FinalCard1);
            System.out.println("Card " + j + ":" + FinalCard2);
            System.out.println("Cycle N:"+cycle);
            System.out.println("do you want to do it again?");
            System.out.println("0=NO    1=YES");
            i=1;
            j=2;
            cycle++;


            Scanner input;
            input = new Scanner(System.in);
            s=input.nextInt();

        }while(s!=0);
    }
}