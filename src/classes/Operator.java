package classes;

import java.util.*;

public class Operator {
    public void firstTaskMethod(List<Person> persons){
        //persons.sort(Comparator.comparingInt(Person::getAge));                                            //Розв'язок за n * log(n)

        Person[] temp = new Person[persons.size()];                                                                    //Розв'язок за O(n + k), де k - найбльше число, а так як
        for(int i = 0; i < persons.size(); i++){                                                                                // k - незрівнянно менше за n (n = 10^8 у першому завданні,
            temp[i] = persons.get(i);                                                                                            // n = 10^5 у другому, а k < 300 при сортуванні за вагою,
        }                                                                                                                                   // k < 220 при сортуванні за зростом і k < 100 при сортуванні
        Sorter.countSortByAge(temp);                                                                                    // за віком), то можна припустити що це розв'язок за O(n)
        for(int i = 0; i < persons.size(); i++){
            persons.set(i, temp[i]);
        }
    }



    public void secondTaskMethod(List<Person> persons){
        Scanner scan = new Scanner(System.in);
        Person[] temp = new Person[persons.size()];
        for(int i = 0; i < persons.size(); i++){
            temp[i] = persons.get(i);
        }
        byte ind;

        while (true) {
            System.out.println("\nTo sort by weight type - 1\nTo sort by height type - 2\n");
            ind = scan.nextByte();
            if (ind == 1){
                Sorter.countSortByWeight(temp);
                break;
            }else if(ind == 2){
                Sorter.countSortByHeight(temp);
                break;
            }else {
                System.out.println("Wrong number, try again");
            }
        }

        for(int i = 0; i < persons.size(); i++){
            persons.set(i, temp[i]);
        }
    }

    public long thirdTaskMethod(List<Person> persons){
        List<Person> res = new ArrayList<>(persons);
        long total = 0;

        res.sort((o1, o2) -> {
            if(o1.getWeight() != o2.getWeight()){
                return o1.getWeight() - o2.getWeight();
            }else {
                return o1.getHeight() - o2.getHeight();
            }
        });

        for(int i = 0; i < res.size(); i++){
            if(i < res.size() - 1 && res.get(i).getWeight() == res.get(i + 1).getWeight() && res.get(i).getHeight() != res.get(i + 1).getHeight()){
                total++;
            }
        }

        return total;
    }

}
