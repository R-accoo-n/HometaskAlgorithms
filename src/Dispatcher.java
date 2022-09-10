import classes.Operator;
import classes.Person;

import java.util.ArrayList;
import java.util.Random;

public class Dispatcher {
    public static void main(String[] args) {
        Operator o = new Operator();
        Random rn = new Random();
        ArrayList<Person> persons = new ArrayList<>();
        int total = 10;                                                                                                 //Змінна для вказівки кількості елементів для тестуввання
        for(int i = 0; i < total; i++){
            persons.add(new Person(rn.nextInt(5), rn.nextInt(5), rn.nextInt(5)));
        }

        System.out.println("\nWithout any sort\n");
        for(Person temp : persons){
            System.out.println(temp);
        }

        o.firstTaskMethod(persons);

        System.out.println("\nFirst task sort (by age)\n");

        for(Person temp : persons){
            System.out.println(temp);
        }

        o.secondTaskMethod(persons);

        System.out.println("\nSecond task sort (by height or weight)\n");

        for(Person temp : persons){
            System.out.println(temp);
        }

        System.out.println("\nThird task answer (count of persons with different height but same weight):");

        System.out.println(o.thirdTaskMethod(persons));


    }
}
