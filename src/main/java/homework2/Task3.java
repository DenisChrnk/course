package homework2;

public class Task3 {
    public static void main(String[] args) {
        Item pen = new Item("ручка", 12343, 50.6, 4,"red");
        Item pencil = new Item("карандаш", 46463,46.67,23,"blue");
        Item ruler = new Item("линейка", 256457, 89.4, 65, "white");
        Item notebook = new Item("тетрадь", 345643,57.2,76,"green");
        Item scissors = new Item("ножницы", 768574, 54.78,12,"yellow");

        System.out.println("Артикул - " + pen.vendorCode + ", " + "название - " + pen.name + ". " + "цена - " + pen.price + ", " + "количество - " + pen.quantity + ", " + "цвет - " + pen.color);
        System.out.println("Артикул - " + pencil.vendorCode + ", " + "название - " + pencil.name + ". " + "цена - " + pencil.price + ", " + "количество - " + pencil.quantity + ", " + "цвет - " + pencil.color);
        System.out.println("Артикул - " + ruler.vendorCode + ", " + "название - " + ruler.name + ". " + "цена - " + ruler.price + ", " + "количество - " + ruler.quantity + ", " + "цвет - " + ruler.color);
        System.out.println("Артикул - " + notebook.vendorCode + ", " + "название - " + notebook.name + ". " + "цена - " + notebook.price + ", " + "количество - " + notebook.quantity + ", " + "цвет - " + notebook.color);
        System.out.println("Артикул - " + scissors.vendorCode + ", " + "название - " + scissors.name + ". " + "цена - " + scissors.price + ", " + "количество - " + scissors.quantity + ", " + "цвет - " + scissors.color);

    }
}
