  //Importing ArrayList
  import java.util.ArrayList;

  public class Monkey {
  
    //Defining variables for later
    String name;
    int age;
    String gender;
    double height;
    
    //Defining lists
    static ArrayList<String> monkeyList = new ArrayList<String>();
    static int[] monkeyAges = new int[5];
    static double[] monkeyHeights = new double[5];
    
    //constructor for creating a Monkey
    public Monkey(String monkeyName, int monkeyAge, char monkeyGender, double monkeyHeight) {
      //Sync added values to more public ones
      age = monkeyAge;
      name = monkeyName;
      height = monkeyHeight;
  
      //Taking char and making it a string for gender
      if (monkeyGender == 'm' || monkeyGender == 'M') {
          gender = "male";
      } else if (monkeyGender == 'f' || monkeyGender == 'F') {
          gender = "female";
      } else {
          gender = "other";
      }
  
      //Add Monkey states to lists and finish out the constructor
      monkeyList.add(name);
  
      for (int i = 0; i < 5; i++) {
        if (monkeyAges[i] == 0) {
          monkeyAges[i] = monkeyAge;
        }
      } 
  
      
      int i1 = 0;
      while (i1 < 5) {
        if (monkeyHeights[i1] == 0) {
          monkeyHeights[i1] = monkeyHeight;
      }
      i1++;
    }
  
      System.out.println(name + ", the monkey has been registered.");
    }
    
  
    public static void main(String[] args) {
    //Using constructor to define new Monkeys
    Monkey Henry = new Monkey("Henry", 4, 'm', 11.1);
    Monkey Jack = new Monkey("Jack", 6, 'M', 13.8);
    Monkey Jill = new Monkey("Jill", 4, 'f', 10.5);
    Monkey Emma = new Monkey("Emma", 5, 'F', 12.2);
    Monkey Mary = new Monkey("Mary", 6, 'f', 11.7);

    //Printing info to make sure everything checks out
    System.out.println(Henry.name + " is " + Henry.age + " and likes to dance.");
    System.out.println("What do we know about Emma? \n" + Emma);
    System.out.println(monkeyList.get(2) + ", the third monkey's age is " + monkeyAges[2]);
    }
    
    //Adding a toString for when a created Monkey is printed
    public String toString() {
    return name + ", the " + gender + " monkey is " + age + " years old.";
    }
  }
  
