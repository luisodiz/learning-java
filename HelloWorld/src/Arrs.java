package helloworld;
import java.util.Arrays;

public class Arrs {
    public static void main(String[] args) {
//        int[] userAge = new int[] {21, 22, 34};
        int[] userAge = {21, 22, 23};

        // Пустой массив с нулями
        int[] userAge3 = new int[5];

        System.out.println(userAge);
        System.out.println(userAge3);

        String[] skills = {"js", "java"};
        userAge[1] = 40;
        userAge[2] += 20;

        System.out.println(userAge[2]);

        int[] arr1 = {1, 2, 33};
        int[] arr2 = {1, 2, 33};
        int[] arr3 = {2, 2, 8};
        boolean isArrsEquals = Arrays.equals(arr1, arr2);
        boolean isArrsEquals2 = Arrays.equals(arr1, arr3);
        System.out.println(isArrsEquals);
        System.out.println(isArrsEquals2);

        int[] source = {12, 1, 5, -2, 16, 22, 44, 16};
        int[] dest = Arrays.copyOfRange(source, 1, 3);
        System.out.println(Arrays.toString(dest));

        int[] numbers2 = {12, 1, 5, -2, 16, 14};
        // Сортировка по возрастанию
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));
        // 60

        // binarySearch
        // Предварительно обязательно надо отсортировать массив
        int[] myInt = {21, 23, 34, 45, 56, 1};
        Arrays.sort(myInt);
        int foundIndex = Arrays.binarySearch(myInt, 1); // Вернет индекс этого элемента
        int foundIndex2 = Arrays.binarySearch(myInt, 300);
        System.out.println(foundIndex);
        System.out.println(foundIndex2);

        // Для массивов длина массива вычисляется через поле length, не через метод
        int[] userAges = {20, 30, 12, 11};
        int userAgesLength = userAges.length;
        System.out.println(userAgesLength);

        String a = "hello";
        String b = a;

        a = "world";
        System.out.println(a);
        System.out.println(b);

        // 8 примитивных типов
        // byte, short, int, long, float, double, char, boolean

        // ссылочные типы
        // String, массивы, классы, интерфейсы

        // Something..
        System.out.println("Oracle".substring(1, 4));
        System.out.println("Hello, " + "how are you?" + " I love Java");

        int result = 79;
        System.out.println("you var is " + result);

        System.out.println("The sum of 50 and 2 is " + (50 + 2) + ".");
        System.out.println("Hello\tWorld");
        System.out.println("Hello\nWorld\nHello\\World");
        System.out.println("Some\"");
        System.out.println("Одинарная кавычка ''''''");

        System.out.printf("The answer for %.3f divided by %d is %.2f", 5.45, 3, 5.45/3);
        System.out.printf("%d", 12);
//        System.out.printf("%d", 12.9); // Error
        System.out.printf("%8d", 12); // спецификатор ширины. 8 символов, значит будет 6 пробелов и потом число 12
        System.out.printf("%8.2f", 12.4);

        System.out.printf("\n%,d", 12343); // флаг разделителя групп разрядов
        System.out.printf("\n%,.2f", 12345.56789);
    }
}
