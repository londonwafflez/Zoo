package Zoo;

public class Animal {

    //Defining var
    final String name;
    public int age;
    public String gender;
    public double height;

    public Animal(String name, int age, char gender, double height) {
        //Sync added values to more public ones
        this.age = age;
        this.name = name;
        this.height = height;
    
        //Taking char and making it a string for gender
        if (gender == 'm' || gender == 'M') {
            this.gender = "male";
        } else if (gender == 'f' || gender == 'F') {
            this.gender = "female";
        } else {
            this.gender = "other";
        }
      }
}