package rocks.zipcode.io.quiz4.collections;

import java.util.Objects;

/**
 * @author leon on 11/12/2018.
 */

// TODO Ask about amountOfHours
public class Student {

    private final Integer id;
    private Double amountOfHours;

    public Student() {
        this(0);
    }

    public Student(Integer id) {
        this.id = id;
        this.amountOfHours = 0.0;
    }

    public void learn(Double amountOfHours) {
        this.amountOfHours = this.amountOfHours + amountOfHours;
    }

    public Double getTotalStudyTime() {
        return amountOfHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id.equals(student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
