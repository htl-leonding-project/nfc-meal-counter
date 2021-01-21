package at.htl.mealcounter.control;

import at.htl.mealcounter.entity.Consumation;
import at.htl.mealcounter.entity.Person;
import io.quarkus.test.junit.QuarkusTest;
import org.assertj.db.api.Assertions;
import org.assertj.db.type.Table;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.sql.DataSource;
import java.time.LocalDate;

import static org.assertj.db.output.Outputs.output;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class PersonRepositoryTest {

    @Inject
    PersonRepository personRepository;

    private static DataSource dataSource;

    @BeforeAll
    static void Init() {
        dataSource = DatabaseHelper.getDatasource();
    }

    @Test
    @Order(1)
    void save() {

        Person person = new Person("Michelle", "Obama", 2021, "4a");
        person = personRepository.save(person);

        Table table = new Table(dataSource, DatabaseHelper.PERSON_TABLE);
        output(table).toConsole();

        Assertions.assertThat(table).row(2)
                .value("FIRST_NAME").isEqualTo(person.getFirstName())
                .value("LAST_NAME").isEqualTo(person.getLastName())
                .value("YEARNO").isEqualTo(person.getYearno())
                .value("CLASS_NAME").isEqualTo(person.getClassName());
    }

}