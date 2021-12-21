package Zoo;
  //Importing ArrayList
  import java.util.ArrayList;
  import java.util.Date;


  public class Monkey extends Animal {
    //Habitat.initialize()

    //Defining lists
    public static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    public static ArrayList<String> monkeyNames = new ArrayList<String>();
    public static int[] monkeyAges = new int[5];
    public static double[] monkeyHeights = new double[5];
    
    public void MONKEY() {
      System.out.println("                __------__ ");
      System.out.println("              /~          ~\\ ");
      System.out.println("             |    //^\\\\//^\\| ");
      System.out.println("           /~~\\  ||  o| |o|:~\\ ");
      System.out.println("          | |6   ||___|_|_||:| ");
      System.out.println("           \\__.  /      o  \\/' ");
      System.out.println("            |   (       O   ) ");
      System.out.println("   /~~~~\\    `\\  \\         / ");
      System.out.println("  | |~~\\ |     )  ~------~`\\ ");
      System.out.println(" /' |  | |   /     ____ /~~~)\\ ");
      System.out.println("(_/'   | | |     /'    |    ( | ");
      System.out.println("       | | |     \\    /   __)/ \\ ");
      System.out.println("       \\  \\ \\      \\/    /' \\   `\\ ");
      System.out.println("         \\  \\|\\        /   | |\\___| ");
      System.out.println("           \\ |  \\____/     | | ");
      System.out.println("           /^~>  \\        _/ < ");
      System.out.println("          |  |         \\       \\ ");
      System.out.println("          |  | \\        \\        \\ ");
      System.out.println("          -^-\\  \\       |        ) ");
      System.out.println("               `\\_______/^\\______/ ");
    }
    
    //constructor for creating a Monkey    
    public Monkey(String monkeyName, int monkeyAge, char monkeyGender, double monkeyHeight) {

      super(monkeyName, monkeyAge, monkeyGender, monkeyHeight);
  
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

      int reqMonOut = (int)(Math.random() * 3 - 1 + 1) + 1;

      
      switch (reqMonOut) {
        case 1:
          return "What do we know about " + this.name + "? \nWe know that this " + this.gender + ", " + this.age + " year old monkey is " + this.height + " inches tall.";

        case 2:
          return this.name + " is " + this.age + " years old and " + this.height + " inches tall";
        
        case 3: 
          return "Info on " + this.name + ": \nAge: " + this.age + "\nGender: " + this.gender + "\nHeight: " + this.height;
        
        default:
          return this.name + ", a" + this.gender + "monkey is " + this.age + " years old and " + this.height + "tall";
      }
    }
    

    //Called with [Class].getMonkeyInfo([name])
    public static void getMonkeyInfo(String reqMonName) {
      
      String search = "Searching. "; 

      Habitat.newLn(20);

      for (int i = 0; i < (int)(Math.random() * 10 + 2) + 1; i++) {
        search = search.concat(". ");
        System.out.println(search);
        Habitat.sleep(500);
        Habitat.newLn(20);
      }

      int reqMonNum = Monkey.monkeyNames.indexOf(reqMonName);

      if (reqMonNum == -1) {
        System.out.println("Search failed try again: \nCheck caps \nCheck spelling \netc...");
        Habitat.newLn();
      } else {

        System.out.println("Complete!");

        Habitat.newLn();

        System.out.println(monkeyList.get(reqMonNum));
      }
    }
    
    //Call with [Monkey].getMonkeyInfo();
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
