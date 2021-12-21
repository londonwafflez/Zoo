package Zoo;

import java.time.chrono.ThaiBuddhistChronology;
import java.util.ArrayList;


public class Animal {

    //Defining var
    final String name;
    public int age;
    public String gender;
    public char genderChar;
    public double height;

    //Defining lists
    public static ArrayList<Animal> animalList = new ArrayList<Animal>();
    public static ArrayList<String> animalNames = new ArrayList<String>();
    public static ArrayList<Integer> animalAges = new ArrayList<Integer>();
    public static ArrayList<Double> animalHeights = new ArrayList<Double>();

    public Animal(String name, int age, char gender, double height) {
        //Sync added values to more public ones
        this.age = age;
        this.name = name;
        this.height = height;
        this.genderChar = gender;

        //Taking char and making it a string for gender
        if (gender == 'm' || gender == 'M') {
            this.gender = "male";
        } else if (gender == 'f' || gender == 'F') {
            this.gender = "female";
        } else {
            this.gender = "other";
        }
    }

    public void addAnimalToList() {
      
        animalNames.add(this.name);
        animalList.add(this);
        animalAges.add(this.age);
        animalHeights.add(this.height);

        if (this.getClass().getName() == "Zoo.Monkey") {
            Monkey monToList = new Monkey(this.name, this.age, this.genderChar, this.height);
            monToList.addMonkeyToList();
        }
    
    }
}