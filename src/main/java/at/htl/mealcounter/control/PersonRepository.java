package at.htl.mealcounter.control;

import at.htl.mealcounter.entity.Person;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;


@ApplicationScoped
public class PersonRepository {

    @Inject
    EntityManager em;

    public Person findById(String id) {
       return em.find(Person.class,id);
    }

    public List<Person> findAll() {
        return null;
    }

    @Transactional
    public Person save(Person person) {
        return em.merge(person);
    }

    @Transactional
    public void delete(long id) {
    }
}
