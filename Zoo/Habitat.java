package Zoo;
import java.util.Scanner;

public class Habitat {
    static int year = 2021;

//Idea credit goes to Kyle H
    public static void newLn() {
        System.out.println("");
    }
    
    public static void newLn(int lines) {
        if (lines != 0) {
            for (int i = 0; i < lines; i++){
                System.out.println("");
            }
        } else if (lines == 0) {
            System.out.println("");
        } else {
            System.out.println("Check newLn method to see why input isn't listed");
        }
    }



    public static void passTime(int years) {

        year += years;
        
        for (int i = 0; i <= years; i++) {
            for (Monkey monkey : Monkey.monkeyList) {
                monkey.age += years;
                monkey.height += Math.random() * 3 - 0 + 1;
            }
        }

        System.out.println(years + " years have passed");
    }

    public static void sleep(int time) {
        try {
            Thread.sleep(time);

        } catch (InterruptedException e) {
            System.out.println("Oh no an error with sleep :( \nError: " + e);
        }
    }
    
    public static Scanner keyboard = new Scanner(System.in);
}
