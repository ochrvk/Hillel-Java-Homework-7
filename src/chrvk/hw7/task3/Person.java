package chrvk.hw7.task3;

import java.util.Objects;

public class Person {
    private final String name;
    private final int hoursCount;

    public Person(String name, int hoursCount) {
        this.name = name;
        this.hoursCount = hoursCount;
    }

    public String getName() {
        return name;
    }

    public int getHoursCount() {
        return hoursCount;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", hoursCount=" + hoursCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return hoursCount == person.hoursCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hoursCount);
    }
}
