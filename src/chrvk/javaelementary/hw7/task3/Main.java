/*Есть List объектов у каждого из которых 2 поля: int и String.
Удалить те у которых значения int повторяются(оставить по одному из дубликатов).*/
package chrvk.javaelementary.hw7.task3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alex", 23));
        people.add(new Person("John", 51));
        people.add(new Person("Ben", 23));
        people.add(new Person("Alex", 23));
        people.add(new Person("Carl", 40));
        people.add(new Person("Ben", 51));

        Set<Person> set = new HashSet<>(people);

        System.out.println(set);
    }
}
