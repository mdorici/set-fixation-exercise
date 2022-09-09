package entities;

import java.util.Objects;

public class Students {
    private Integer userNumber;

    public Students(){
    }

    public Students(Integer userNumber) {
        this.userNumber = userNumber;
    }

    public Integer getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Integer userNumber) {
        this.userNumber = userNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Objects.equals(userNumber, students.userNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userNumber);
    }
}
