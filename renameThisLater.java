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
  
  public Monkey(int monkeyAge, String monkeyName, char monkeyGender, double monkeyHeight) {
    age = monkeyAge;
    name = monkeyName;
    height = monkeyHeight;
    if (monkeyGender.equals('m') || monkeyGender.equals('M')) {
        gender = "male";
    } else if (monkeyGender.equals('f') || monkeyGender.equals('F')) {
        gender = "female";
    } else {
        gender = "other";
    }
    }
    monkeyList.add(name);
    System.out.println(name + ", the monkey has been registered.");
  }
  
  
  
  public static void main(String[] args) {
  System.out.println("Running");
  }
  
  public String toString() {
  return name + ", the " + gender + " monkey is " + age + " years old";
  }
} 
