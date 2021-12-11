package Zoo;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        
        //Using constructor to define new Monkeys
        Monkey Henry = new Monkey("Henry", 4, 'm', 11.1);
        Monkey Jack = new Monkey("Jack", 6, 'M', 13.8);
        Monkey Jill = new Monkey("Jill", 4, 'f', 10.5);
        Monkey Emma = new Monkey("Emma", 5, 'F', 12.2);
        Monkey Mary = new Monkey("Mary", 6, 'f', 11.7);

        Habitat.newLn();

        Henry.addMonkeyToList();
        Jack.addMonkeyToList();
        Jill.addMonkeyToList();
        Emma.addMonkeyToList();
        Mary.addMonkeyToList();

        //Printing info to make sure everything checks out
        System.out.println(Henry.name + " is " + Henry.age + " and likes to dance.");
        System.out.println("What do we know about Emma? \n" + Emma.getMonkeyInfo());
        Habitat.passTime(2);
        System.out.println(Monkey.monkeyNames.get(2) + ", the third monkey's age is " + Monkey.monkeyAges[2] + ".");
    }

}