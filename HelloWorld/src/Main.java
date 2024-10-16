package helloworld;

public class Main {
    public static void main(String[] args) {
//        System.out.println("hello world");

        // Примитивные типы. Их 8. Первые 4 без дробной части

        // byte. от -128 до 127. Один байт памяти. Хранение небольших чисел
        // short. от -32 768 до 32 767. Два байта памяти
        // int. до 2 с чем то миллиардов. 4 байта памяти. Чаще всего используется для хранения целых чисел
        // long. большие числа. 8 байт памяти. Чтобы обозначить значение типа long, то необходимо добавить суффикс L в конце


        // С дробной частью
        // float. Использует 4 байта памяти. Точность приблизительно до 7 цифр
        // double. 8 байт памяти. Точность приблизительно до 15 цифр

        // если определить число с плавающей точкой, то по умолчанию она double. Для интерпретации как float надо cуффикс F в конце
        // Если памяти в системе много, то рекомендуется использовать double так как имеет большую точность

        // Осталось два примитивных типа
        // char - тип данных для отдельных символов Юникода. 2 байта памяти
        // boolean - true/false



        // Переменные не могут начинаться с цифр
        byte userAge = 20;
        short numberOfStudents = 45;
        int numberOfEmployees = 500;
        long numberOfInhabitants = 2234L;

        float hourlyRate = 69.5F;
        double numberOfHours = 51.5;

        char grade = 'A';
        boolean promote = true;

        byte level = 2, userExperience = 5;

        // так тоже можно
        byte year;
        year = 20;

        byte x = 3;
        int y = x;
        System.out.println("Переменная x равна");
        System.out.println(y);

        int z = 4, r = z;

        z = 2;
        System.out.println(r);

        int one = 7, two = 2;
        System.out.println(one / two); // При делении округление в меньшую сторону целого числа
        System.out.println(one % two); // 1 - остаток от деления

        float oneF = 7F;
        int twoF = 2;
        System.out.println(oneF / twoF); // Интересно

        int superX = 1;
        System.out.println(superX++);

        // Преобразование типов. Если тип, который меньше запихиваем в тип, который больше, то ноль проблем
        short myShort = 2;
        double myDouble = myShort;

        // Если наоборот, то надо сузить тип
        double myDouble2 = 4;
        short myShort2 = (short) myDouble2;

        // или
        int xxx = (int) 20.9;

        // или хочу в float что то
        float num1 = (float) 20.9;
    }
}