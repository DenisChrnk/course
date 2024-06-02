package homework2;

public class Task1 {
    public static void main(String[] args) {
        String cardNumber1 = "1234 5678 9012 3456";
        String cardNumber2 = "1234567890123456";
        String card = "**** **** **** ";
        String maskCard1 = cardNumber1.substring(cardNumber1.length() -4);
        String maskCard2 = cardNumber2.substring(cardNumber2.length() -4);
        System.out.println(card + maskCard1);
        System.out.println(card +  maskCard2);
    }
}
