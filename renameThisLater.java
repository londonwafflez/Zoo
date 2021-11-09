//Importing ArrayList
import java.util.ArrayList;

public class Monkey {

  //Defining variables for later
  String name;
  int age;
  String gender;
  double height;
  
  //Defining lists
  ArrayList generalInfoList = new ArrayList();
  public ArrayList<String> monkeyList = new ArrayList<String>();
  int[] monkeyAges = new int[5];
  double[] monkeyHeights = new double[5];
  
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
    //Add Monkey to MonkeyList and finish out the constructor
    monkeyList.add(name);
    System.out.println(name + ", the monkey has been registered.");
  }

  //add method here
  
  public static void main(String[] args) {
  //Using constructor to define new Monkeys
  Monkey Henry = new Monkey("Henry", 4, 'm', 11.1);
  Monkey Jack = new Monkey("Jack", 6, 'm', 13.8);
  Monkey Jill = new Monkey("Jill", 4, 'f', 10.5);
  Monkey Emma = new Monkey("Emma", 5, 'f', 12.2);
  System.out.println(Emma.age);
  }
  
  //Adding a toString for when a created Monkey is printed
  public String toString() {
  return name + ", the " + gender + " monkey is " + age + " years old";
  }
} 
