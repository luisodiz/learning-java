package helloworld;

public class Strings {
    public static void main(String[] args) {
        System.out.println("Strings");

        String message = "Hello world";
        String anotherMessage = "";

        // Конкатенация
        String myName = "Alexander" + " " + "Sosov";
        System.out.println(myName);

        int lengthOfName = myName.length();
        System.out.println(lengthOfName);

        String lName = myName.toLowerCase();
        String uName = myName.toUpperCase();

        System.out.println(lName);
        System.out.println(uName);

        String surname = myName.substring(4);
        String subStr2 = myName.substring(0, 4);
        System.out.println(surname);
        System.out.println(subStr2);

        char myChar = (char) "Hello world".charAt(2);
        System.out.println(myChar);

        boolean equalsOrNot = "this is Alex".equals("this is Alex");
        boolean equalsOrNot2 = "this is Alex".equals("hello world");
        System.out.println(equalsOrNot);
        System.out.println(equalsOrNot2);

        String names = "Peter, Alex, Ivan";
        String[] splitNames = names.split(", ");

        System.out.println(splitNames);
    }
}
