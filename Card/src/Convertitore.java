public class Convertitore {

    private static String valore;

    public static String suit;

    public static String converter(int []carta1) {
        suit = "♠♣♦♥";
        valore = "123456789TJQK";

        String Cartafin = null;

        if(carta1[0]<9){
            int val=carta1[0]+1;
            Cartafin= String.valueOf(val);

        }else if(carta1[0]>=9) {
            switch (carta1[0]){
                case 9:
                   Cartafin="10";
                   break;
                case 10:
                    Cartafin="J";
                    break;
                case 11:
                    Cartafin="K";
                    break;
                case 12:
                    Cartafin="Q";
                    break;
            }
        }
        String cartafinale=null;
        switch(carta1[1]){
            case 0:
                cartafinale=Cartafin+"♠";
            break;

            case 1:
                cartafinale=Cartafin+"♣";
                break;

            case 2:
                 cartafinale=Cartafin+"♦";
                break;

            case 3:
                cartafinale=Cartafin+"♥";
                break;
        }

        return cartafinale;
    }
}









