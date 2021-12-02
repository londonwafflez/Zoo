package Zoo;

import java.util.ArrayList;

public class Zoo {
    


    static int year = 2021;

    public static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    public static ArrayList<String> monkeyNames = new ArrayList<String>();
    public static int[] monkeyAges = new int[5];
    public static double[] monkeyHeights = new double[5];

    public static void passTime(int years) {

        year += years;
        
        for (int i = 0; i <= years; i++) {
            for (Monkey monkey : monkeyList) {
                monkey.age += years;
                monkey.height += Math.random() * 3 - 0 + 1;
            }
        }
    }

    public static void main(String[] args) {

      //Using constructor to define new Monkeys
      Monkey Henry = new Monkey("Henry", 4, 'm', 11.1);
      Monkey Jack = new Monkey("Jack", 6, 'M', 13.8);
      Monkey Jill = new Monkey("Jill", 4, 'f', 10.5);
      Monkey Emma = new Monkey("Emma", 5, 'F', 12.2);
      Monkey Mary = new Monkey("Mary", 6, 'f', 11.7);

      Henry.addMonkeyToList();
      Jack.addMonkeyToList();
      Jill.addMonkeyToList();
      Emma.addMonkeyToList();
      Mary.addMonkeyToList();

      //Printing info to make sure everything checks out
      System.out.println(Henry.name + " is " + Henry.age + " and likes to dance.");
      System.out.println("What do we know about Emma? \n" + Emma.getMonkeyInfo());
      Zoo.passTime(2);
      System.out.println(monkeyNames.get(2) + ", the third monkey's age is " + monkeyAges[2] + ".");
    }

}