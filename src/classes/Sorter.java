package classes;

import java.util.Arrays;
import java.util.Comparator;

public class Sorter {
    static void countSortByAge(Person[] arr) {
        int max = Arrays.stream(arr).max(Comparator.comparingInt(Person::getAge)).orElse(new Person(-1, -1, -1)).getAge();
                                                                                                                        //Для уникнення виникнення помилки NoSuchElementException створення,
                                                                                                                        // за потреби, не існуючого елемента з параметрами (-1, -1, -1)
        int min = Arrays.stream(arr).min(Comparator.comparingInt(Person::getAge)).orElse(new Person(-1, -1, -1)).getAge();
                                                                                                                        //Для уникнення виникнення помилки NoSuchElementException створення,
                                                                                                                        // за потреби, не існуючого елемента з параметрами (-1, -1, -1)
        int range = max - min + 1;
        int[] count = new int[range];
        Person[] output = new Person[arr.length];
        for (Person person : arr) {
            count[person.getAge() - min]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i].getAge() - min] - 1] = arr[i];
            count[arr[i].getAge() - min]--;
        }

        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    static void countSortByWeight(Person[] arr) {
        int max = Arrays.stream(arr).max(Comparator.comparingInt(Person::getWeight)).orElse(new Person(-1, -1, -1)).getWeight();
                                                                                                            //Для уникнення виникнення помилки NoSuchElementException створення,
                                                                                                            // за потреби, не існуючого елемента з параметрами (-1, -1, -1)
        int min = Arrays.stream(arr).min(Comparator.comparingInt(Person::getWeight)).orElse(new Person(-1, -1, -1)).getWeight();
                                                                                                            //Для уникнення виникнення помилки NoSuchElementException створення,
                                                                                                            // за потреби, не існуючого елемента з параметрами (-1, -1, -1)
        int range = max - min + 1;
        int[] count = new int[range];
        Person[] output = new Person[arr.length];
        for (Person person : arr) {
            count[person.getWeight() - min]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i].getWeight() - min] - 1] = arr[i];
            count[arr[i].getWeight() - min]--;
        }

        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    static void countSortByHeight(Person[] arr) {
        int max = Arrays.stream(arr).max(Comparator.comparingInt(Person::getHeight)).orElse(new Person(-1, -1, -1)).getHeight();
                                                                                                                                //Для уникнення виникнення помилки NoSuchElementException створення,
                                                                                                                                // за потреби, не існуючого елемента з параметрами (-1, -1, -1)
        int min = Arrays.stream(arr).min(Comparator.comparingInt(Person::getHeight)).orElse(new Person(-1, -1, -1)).getHeight();
                                                                                                                                //Для уникнення виникнення помилки NoSuchElementException створення,
                                                                                                                                // за потреби, не існуючого елемента з параметрами (-1, -1, -1)
        int range = max - min + 1;
        int[] count = new int[range];
        Person[] output = new Person[arr.length];
        for (Person person : arr) {
            count[person.getHeight() - min]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i].getHeight() - min] - 1] = arr[i];
            count[arr[i].getHeight() - min]--;
        }

        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    private Sorter(){}
}
