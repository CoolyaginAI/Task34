import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String newName;
        Integer newAge;

        System.out.println("Введите имя первого пользователя");
        newName = in.nextLine();
        System.out.println("Введите возраст первого пользователя");
        newAge = in.nextInt();

        User user1 = new User(newName, newAge);


        System.out.println("Введите имя второго пользователя");
        in.nextLine(); // РЕШЕНИЕ ПРОБЛЕМЫ СО СЧИТЫВАНИЕМ
        newName = in.nextLine();
        System.out.println("Введите возраст второго пользователя");
        newAge = in.nextInt();

        User user2 = new User(newName, newAge);

        if (user1.getAge() == user2.getAge()) System.out.println("У них одинаковый возраст");
         else if (user1.getAge() < user2.getAge()) System.out.println(user1.toString());
               else System.out.println(user2.toString());
    }
}