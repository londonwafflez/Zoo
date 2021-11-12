  //Importing ArrayList
  import java.util.ArrayList;
  import java.util.Random;

  public class Monkey {
  
    //Defining variables for later
    final String name;
    private int age;
    private String gender;
    private double height;
    
    //Defining lists
    static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    static ArrayList<String> monkeyNames = new ArrayList<String>();
    static int[] monkeyAges = new int[5];
    static double[] monkeyHeights = new double[5];
    
    //constructor for creating a Monkey
    public Monkey(String monkeyName, int monkeyAge, char monkeyGender, double monkeyHeight) {
      //Sync added values to more public ones
      this.age = monkeyAge;
      this.name = monkeyName;
      this.height = monkeyHeight;
  
      //Taking char and making it a string for gender
      if (monkeyGender == 'm' || monkeyGender == 'M') {
          this.gender = "male";
      } else if (monkeyGender == 'f' || monkeyGender == 'F') {
          this.gender = "female";
      } else {
          this.gender = "other";
      }
  
      System.out.println(this.name + ", the monkey has been registered.");
    }

    public void passYear(int yearsPassed) {
      this.age += 1;
    }

    public void addMonkeyToList() {
      
      monkeyList.add(this);

      monkeyNames.add(this.name);
      
      for (int i = 0; i < 5; i++) {
        if (monkeyAges[i] == 0) {
          monkeyAges[i] = this.age;
        }
      } 
  
      
      int i1 = 0;
      while (i1 < 5) {
        if (monkeyHeights[i1] == 0) {
          monkeyHeights[i1] = this.height;
        }
      i1++;

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
      System.out.println(monkeyNames.get(2) + ", the third monkey's age is " + monkeyAges[2] + ".");
    }
    
    //Adding a toString for when a created Monkey is printed
    public String toString() {
      return this.name + ", the " + this.gender + " monkey is " + this.age + " years old.";
    }

    
    public Monkey getMonkeyInfo() {
      Monkey searchMatch = null;
      for (Monkey monkeyLst : monkeyList) {
        if (monkeyLst == this) {
          searchMatch = monkeyLst;
          break;
        }
      }
      return searchMatch;
    }
  }
