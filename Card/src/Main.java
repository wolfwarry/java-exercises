import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        boolean uguale=false;
        int [] carta1 = new int[2];
        int [] carta2 = new int[2];
        String cartaf1=null;
        String cartaf2=null;
        int i=1;
        int j=2;
       do {
           Card card1 = new Card(carta1);
           Card card2 = new Card(carta2);

           uguale= Arrays.equals(carta1, carta2);
           cartaf1=Convertitore.converter(carta1);
           cartaf2=Convertitore.converter(carta2);

           if (uguale)
                break;

           System.out.println("carta "+i+":"+cartaf1);

           System.out.println("carta "+j+":"+cartaf2);
            i++;
            j++;
            System.out.println("----------------------");
       }while (!uguale);

        System.out.println("CARTA UGUALE TROVATA");
        System.out.println("carta "+i+":"+cartaf1);
        System.out.println("carta "+j+":"+cartaf2);

        System.out.println("addio");
        System.exit(0);

    }
}