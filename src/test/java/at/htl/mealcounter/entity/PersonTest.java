package at.htl.mealcounter.entity;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void t100_createPerson() {
        //Brooke;Bradford
        Person brooke = new Person("Brooke", "Bradford", 2020, "1a");
        System.out.println(brooke);
    }

    @Test
    void t010_toString() {
        Person person = new Person("Brooke", "Bradford", 2020, "1a");

        assertThat(person.toString()).isEqualTo("Person{id=null, nfcId='null', firstName='Brooke', lastName='Bradford', year=2020, className='1a'}");

    }
}
