package Zoo;
  //Importing ArrayList
  import java.util.ArrayList;


  public class Monkey extends Animal {
    
    //Defining lists
    public static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    public static ArrayList<String> monkeyNames = new ArrayList<String>();
    public static int[] monkeyAges = new int[5];
    public static double[] monkeyHeights = new double[5];
    

    //constructor for creating a Monkey

    
    public Monkey(String monkeyName, int monkeyAge, char monkeyGender, double monkeyHeight) {

      super(monkeyName, monkeyAge, monkeyGender, monkeyHeight);

      //Sync added values to more public ones
      // this.age = monkeyAge;
      // this.name = monkeyName;
      // this.height = monkeyHeight;
  
      // //Taking char and making it a string for gender
      // if (monkeyGender == 'm' || monkeyGender == 'M') {
      //     this.gender = "male";
      // } else if (monkeyGender == 'f' || monkeyGender == 'F') {
      //     this.gender = "female";
      // } else {
      //     this.gender = "other";
      // }
  
      System.out.println(this.name + ", the monkey has been registered.");
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
