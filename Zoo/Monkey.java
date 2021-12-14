package Zoo;
  //Importing ArrayList
  import java.util.ArrayList;
  import java.util.Date;


  public class Monkey extends Animal {
    
    //Defining lists
    public static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    public static ArrayList<String> monkeyNames = new ArrayList<String>();
    public static int[] monkeyAges = new int[5];
    public static double[] monkeyHeights = new double[5];
    
    /* MONKEY
                    __------__
              /~          ~\
             |    //^\\//^\|
           /~~\  ||  o| |o|:~\
          | |6   ||___|_|_||:|
           \__.  /      o  \/'
            |   (       O   )
   /~~~~\    `\  \         /
  | |~~\ |     )  ~------~`\
 /' |  | |   /     ____ /~~~)\
(_/'   | | |     /'    |    ( |
       | | |     \    /   __)/ \
       \  \ \      \/    /' \   `\
         \  \|\        /   | |\___|
           \ |  \____/     | |
           /^~>  \        _/ <
          |  |         \       \
          |  | \        \        \
          -^-\  \       |        )
               `\_______/^\______/
      */

    
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
          return "What do we know about " + this.name + "? \n We know that this " + this.gender + ", " + this.age + " year old monkey is " + this.height + " inches tall.";

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
      for (int i = 0; i < (int)Math.random(); i++) {
        System.out.println(search);
        //Monkey.sleep(250); See 115
        search = search.concat(". ");
      }

      int reqMonNum = Monkey.monkeyNames.indexOf(reqMonName);

      System.out.println(reqMonNum);

      if (reqMonNum == -1) {
        System.out.println("Search failed try again: \nCheck caps \nCheck spelling \netc...");
      } else {

        System.out.println("Complete!");
        //Monkey.sleep(1000); I have no idea how to use it also at 102

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
