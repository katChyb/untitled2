import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek");
        int age = scanner.nextInt();

        // >, <, >=, <=, ==, !=

//        if (age>=18) {
//            System.out.println("jesteś pełnoletni");
//        } else {
//            System.out.println("Nie jesteś pełnoletni");
//        }
//
//        if(age == 100){
//            System.out.println("wow, masz aż 100 lat");
//        }

        System.out.println(age+2);
        System.out.println(age-2);
        System.out.println(age*2);
        System.out.println(age/2);
        System.out.println(age%2); // reszta z dzielenia -> modulo

    }
}