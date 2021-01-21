package at.htl.mealcounter.control;

import at.htl.mealcounter.entity.Consumation;
import at.htl.mealcounter.entity.Person;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.assertj.db.type.Table;


import static org.junit.jupiter.api.Assertions.*;
import javax.inject.Inject;
import java.time.LocalDate;


class ConsumationRepositoryTest {

    @Inject
    ConsumationRepository consumationRepository;

    @Test
    @Order(1)
    void save() {

        Person person = new Person("Brooke", "Bradford", 2020, "1a");

        Consumation consumation = new Consumation(person, LocalDate.of(2021,1,8),true);
        consumationRepository.save(consumation);

        Table table = new Table(Database.getDataSource(), "answer_option");

        Assertions.assertThat(table).row(0)
                .value("ao_text").isEqualTo("völlig zu")
                .value("ao_value").isEqualTo(4)
                .value("ao_q_id").isEqualTo(1);


    }

}