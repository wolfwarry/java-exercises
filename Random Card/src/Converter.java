public class Converter {
    public static String converter(int[] carta1) {

        String RisCard;

        if (carta1[0] < 9) {
            int val = carta1[0] + 1;
            RisCard = String.valueOf(val);

        } else {
            RisCard = switch (carta1[0]) {
                case 9 -> "10";
                case 10 -> "J";
                case 11 -> "K";
                case 12 -> "Q";
                default ->("error");
            };
        }
        return switch (carta1[1]) {
            case 0 -> RisCard + "♠";
            case 1 -> RisCard + "♣";
            case 2 -> RisCard + "♦";
            case 3 -> RisCard + "♥";
            default -> null;
        };
    }
}


