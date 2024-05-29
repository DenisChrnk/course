package homework;

public class Homework1 {
    public static void main(String[] args) {

        String fullName = "Черненко Денис";

        // позволяет проверить строку на пустоту
        boolean result1 = fullName.isEmpty();
        System.out.println(result1);

        // проверят строку на пустоту или содержание только пробелов
        boolean result2 = fullName.isBlank();
        System.out.println(result2);

        // возвращает подстроку, начиная с определенного индекса до конца или до определенного индекса
        String result3 = fullName.substring(3);
        String result4 = fullName.substring(3,11);
        System.out.println(result3);
        System.out.println(result4);

        // находит индекс первого вхождения подстроки в строку
        int result5 = fullName.indexOf("н");
        System.out.println(result5);

        // находит индекс последнего вхождения подстроки в строку
        int result6 = fullName.lastIndexOf("е");
        System.out.println(result6);

        // переводит все символы строки в нижний регистр
        String result7 = fullName.toLowerCase();
        System.out.println(result7);

        // переводит все символы строки в верхний регистр
        String result8 = fullName.toUpperCase();
        System.out.println(result8);

        // позволяет заменить в строке одно значение на другое
        String result9 = fullName.replace("Черненко","Пупкин");
        System.out.println(result9);

        // позволяет определить начинается ли строка с определенной подстроки
        boolean result10 = fullName.startsWith("Пупкин");
        System.out.println(result10);

        // позволяет определить заканчивается ли строка на определенную подстроку
        boolean result11 = fullName.endsWith("Денис");
        System.out.println(result11);

        // повторяет n раз (где n передается в качестве параметра) содержимое строки, а затем возвращает сконкатенированный результат
        String result12 = fullName.repeat(2);
        System.out.println(result12);

        //  позволяющий проверить, содержит ли String другую подстроку или нет
        boolean result13 = fullName.contains("ни");
        System.out.println(result13);

        // объединяет строки
        String result14 = fullName.concat(" Сергеевич");
        System.out.println(result14);

        // позволяет удалить начальные и конечные пробелы
        String result15 = "   Привет!    ";
        String result16 = "   Привет!    ";
        System.out.println(result15);
        System.out.println(result16.trim());

        // используется для сравнения строк
        boolean result17 = fullName.equals("Привет");
        System.out.println(result17);

    }
}
