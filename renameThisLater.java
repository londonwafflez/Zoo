import java.util.ArrayList;

public class Monkey {

  String name;
  int age;
  String gender;
  double height;
  
  ArrayList generalInfoList = new ArrayList();
  public ArrayList<String> monkeyList = new ArrayList<String>();
  int[] monkeyAges = new int[5];
  double[] monkeyHeights = new double[5];
  
  public Monkey(String monkeyName, int monkeyAge, char monkeyGender, double monkeyHeight) {
    age = monkeyAge;
    name = monkeyName;
    height = monkeyHeight;
    if (monkeyGender == 'm' || monkeyGender == 'M') {
        gender = "male";
    } else if (monkeyGender == 'f' || monkeyGender == 'F') {
        gender = "female";
    } else {
        gender = "other";
    }
    monkeyList.add(name);
    System.out.println(name + ", the monkey has been registered.");
  }
  
  
  
  public static void main(String[] args) {
  Monkey Henry = new Monkey("Henry", 4, 'm', 11.1);
  Monkey Jill = new Monkey("Jill", 4, 'f', 10.5);
  
  }
  
  public String toString() {
  return name + ", the " + gender + " monkey is " + age + " years old";
  }
} 
