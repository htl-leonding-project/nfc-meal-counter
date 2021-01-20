package at.htl.mealcounter.entity;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ConsumationTest {

    @Test
    void t100_createConsumation() {
        Person person = new Person("Brooke", "Bradford", 2020, "1a");

       Consumation consumation = new Consumation(person, LocalDate.of(2021,1,8),true);
       System.out.println(consumation);
    }

}