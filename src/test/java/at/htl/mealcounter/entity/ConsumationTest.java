package at.htl.mealcounter.entity;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class ConsumationTest {

    @Test
    void t100_createConsumation() {
        Person person = new Person("Brooke", "Bradford", 2020, "1a");

       Consumation consumation = new Consumation(person, LocalDate.of(2021,1,8),true);
       System.out.println(consumation);
    }

    @Test
    void t010_toString() {
        Person person = new Person("Brooke", "Bradford", 2020, "1a");

        Consumation consumation1 = new Consumation(person, LocalDate.of(2021,1,8),true);

        assertThat(consumation1.toString()).isEqualTo("Consumation{person=Person{id=null, nfcId='null', firstName='Brooke', lastName='Bradford', year=2020, className='1a'}, date=2021-01-08, hasConsumed=true}");

    }

}