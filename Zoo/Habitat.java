package Zoo;

public class Habitat {
    static int year = 2021;

    //Idea credit goes to Kyle H
    public static void newLn() {
        System.out.println("");
    }

    public static void passTime(int years) {

        year += years;
        
        for (int i = 0; i <= years; i++) {
            for (Monkey monkey : Monkey.monkeyList) {
                monkey.age += years;
                monkey.height += Math.random() * 3 - 0 + 1;
            }
        }

        System.out.println(years + " years have passed");
    }
}
