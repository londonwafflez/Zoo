package Zoo;

import java.util.ArrayList;
import java.lang.Math.*;
import java.io.InterruptedIOException;
import java.io.IOException;  
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        
        //Using constructor to define new Monkeys
        Monkey Henry = new Monkey("Henry", 4, 'm', 11.1);
        Monkey Jack = new Monkey("Jack", 6, 'M', 13.8);
        Monkey Jill = new Monkey("Jill", 4, 'f', 10.5);
        Monkey Emma = new Monkey("Emma", 5, 'F', 12.2);
        Monkey Mary = new Monkey("Mary", 6, 'f', 11.7);

        Habitat.sleep(1500);
        Habitat.newLn();

        Henry.addAnimalToList();
        Jack.addAnimalToList();
        Jill.addAnimalToList();
        Emma.addAnimalToList();
        Mary.addAnimalToList();

        Habitat.newLn();
        Habitat.sleep(1000);

        //Printing info to make sure everything checks out
        // System.out.println(Henry.name + " is " + Henry.age + " and likes to dance.");
        // System.out.println("What do we know about Emma? \n" + Emma.getMonkeyInfo());

        String reqMonName = "";
        
        while (!(reqMonName.equalsIgnoreCase("Next"))) {

            System.out.println("Which monkey would you like want info on? Type 'List' to show names of monkeys or 'Next' when you're done");
            reqMonName = Habitat.keyboard.nextLine();
            Habitat.newLn();

            if (reqMonName.equalsIgnoreCase("Next")) {
                break;
            }

            if (reqMonName.equalsIgnoreCase("List")) {
                Monkey.monkeyNames.forEach( (monName) -> { System.out.println(monName); } );
            }
            
            Habitat.newLn(5);
            
            Monkey.getMonkeyInfo(reqMonName);

            Habitat.newLn(2);
            
            Habitat.sleep(1500);
        }

        Habitat.sleep(1000);

        Habitat.newLn();

        int randMon = (int)(Math.random() * 4 - 0);
        int randMon1 = randMon + 1;
        String randMonSuffix = "";

        switch (randMon) {
            case 0:
                randMonSuffix = "st";
                break;
            case 1:
                randMonSuffix = "nd";
                break;
            case 2:
                randMonSuffix = "rd";
                break;
            case 3:
            case 4:
                randMonSuffix = "th";
                break;
            default:
                System.out.println("Recheck switch case for randMon");
                System.exit(1);
        }

        System.out.println("Random monkey info:\n" + Monkey.monkeyNames.get(randMon) + ", the " + randMon1 + randMonSuffix + " monkey's age is " + Monkey.monkeyAges[randMon] + ".");
        Habitat.sleep(2000);

        Monkey.monkeyList.get(randMon).MONKEY();
        Habitat.sleep(2000);

        System.out.println("Where would you like to go next? \nAvailable habitats:");
        //for System.out.println()
        String goNext = Habitat.keyboard.nextLine();


    }
}
