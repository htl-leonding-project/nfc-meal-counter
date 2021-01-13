package at.htl.mealcounter.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Consumation {
    Person person;
    LocalDate date;
    boolean hasConsumed;

    public Consumation() {
    }

    public Consumation(Person person, LocalDate date, boolean hasConsumed) {
        this.person = person;
        this.date = date;
        this.hasConsumed = hasConsumed;
    }

    //region getter and setter
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isHasConsumed() {
        return hasConsumed;
    }

    public void setHasConsumed(boolean hasConsumed) {
        this.hasConsumed = hasConsumed;
    }
    //endregion


    @Override
    public String toString() {
        return "Consumation{" +
                "person=" + person +
                ", date=" + date +
                ", hasConsumed=" + hasConsumed +
                '}';
    }
}
