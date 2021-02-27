package at.htl.mealcounter.control;

import at.htl.mealcounter.entity.Person;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.System.out;


@ApplicationScoped
public class PersonRepository {

    @Inject
    EntityManager em;

    public Person findById(long id) {
       return em.find(Person.class,id);
    }

    public List<Person> findAll() {
        return em.createNamedQuery("Person.findAll", Person.class).getResultList();
    }

    @Transactional
    public Person save(Person person) {
        return em.merge(person);
    }

    @Transactional
    public void delete(long id) {
        em.remove(findById(id));
    }


    @Transactional
    public void readFromCsv() {

        URL url = Thread.currentThread().getContextClassLoader().getResource("names.csv");
        try (Stream<String> stream = Files.lines(Paths.get(url.getPath()), StandardCharsets.UTF_8)) {
            stream.skip(1)
                    .map(s -> s.split(";"))
                    .map(a -> new Person(
                            a[1],
                            a[2],
                            Integer.parseInt(String.valueOf(LocalDate.now().getYear())),
                            a[0]))
                    .peek(out::println)
                    .forEach(em::merge);// was heißt das
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
