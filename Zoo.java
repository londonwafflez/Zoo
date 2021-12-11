package Zoo;

import java.util.ArrayList;
import Zoo.Monkey;

public class Zoo {

    static int year = 2021;

    //Idea credit goes to Kyle H
    public static void newLn() {
        System.out.println("");
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

    public static void main(String[] args) {

        
        //Using constructor to define new Monkeys
        Monkey Henry = new Monkey("Henry", 4, 'm', 11.1);
        Monkey Jack = new Monkey("Jack", 6, 'M', 13.8);
        Monkey Jill = new Monkey("Jill", 4, 'f', 10.5);
        Monkey Emma = new Monkey("Emma", 5, 'F', 12.2);
        Monkey Mary = new Monkey("Mary", 6, 'f', 11.7);

        Zoo.newLn();

        Henry.addMonkeyToList();
        Jack.addMonkeyToList();
        Jill.addMonkeyToList();
        Emma.addMonkeyToList();
        Mary.addMonkeyToList();

        //Printing info to make sure everything checks out
        System.out.println(Henry.name + " is " + Henry.age + " and likes to dance.");
        System.out.println("What do we know about Emma? \n" + Emma.getMonkeyInfo());
        Zoo.passTime(2);
        System.out.println(Monkey.monkeyNames.get(2) + ", the third monkey's age is " + Monkey.monkeyAges[2] + ".");
    }

}