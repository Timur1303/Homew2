public class Main {

    public static void main(String[] args) {
        int age = 60;
        int temperature = 30;
        String word = "Возраст";
        String temp = "температура";

        System.out.println(addition(60, 30, word,temp));

        printAll();
        printAll();
        printAll();
        printAll();
        printAll();


        if ((age > 20 || age < 45) && (temperature > -20 || temperature < 30));   {
            System.out.println("Можно идти гулять");
        }
        if((age < 20) && (temperature > 0 || temperature < 28)) {
                System.out.println("Можно идти гулять");
            }
        if ((age > 45) && (temperature > -10 || temperature < 25)) {
                System.out.println("Можно идти гулять");
            }
        else
            System.out.println("Оставайтесь дома");

    }

    public static String addition (int age, int temperature, String word, String temp) {
        return word + age + temp + temperature;
    }

    public static void printAll() {
        System.out.println("Возраст");
        System.out.println("Температура");
        System.out.println("Дом");
        System.out.println("Гулять");
        System.out.println("Гараж");
    }
}
