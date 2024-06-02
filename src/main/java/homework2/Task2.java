package homework2;

public class Task2 {
    public static void main(String[] args) {
        Flat myFlat = new Flat();
        myFlat.flatNumber = 1;
        myFlat.flatFloor = 5;
        myFlat.ownerName = "Денис";
        myFlat.flatPrice = 12345;
        myFlat.flatSquare = 43.5;

        System.out.println(myFlat.flatFloor);
        System.out.println(myFlat.flatNumber);
        System.out.println(myFlat.flatPrice);
        System.out.println(myFlat.flatSquare);
        System.out.println(myFlat.ownerName);
    }
}
