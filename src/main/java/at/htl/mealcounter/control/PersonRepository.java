package at.htl.mealcounter.control;

import at.htl.mealcounter.entity.Person;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
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
public class PersonRepository implements PanacheRepository<Person> {

    @Inject
    EntityManager em;

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
                    .forEach(em::merge);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Person> findByClass(String currentClassName) {
        return em.createQuery("select p from Person p where p.currentClassName = :currentClassName", Person.class)
                .setParameter("currentClassName", currentClassName).getResultList();
    }

}
