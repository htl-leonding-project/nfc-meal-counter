package at.htl.mealcounter.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void t100_createPerson() {
        //Brooke;Bradford
        Person brooke = new Person("Brooke", "Bradford", 2020, "1a");
        System.out.println(brooke);
    }
}
