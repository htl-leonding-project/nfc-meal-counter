package at.htl.mealcounter.control;

import at.htl.mealcounter.entity.Consumation;
import at.htl.mealcounter.entity.Person;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TemporalType;
import javax.transaction.Transactional;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;



@ApplicationScoped
public class ConsumationRepository {

    @Inject
    EntityManager em;

    public Consumation findById(long id) {
        return em.find(Consumation.class,id);
    }

    public List<Consumation> findAll() {
        return em.createNamedQuery("Consumation.findAll", Consumation.class).getResultList();
    }

    @Transactional
    public Consumation save(Consumation consumation) {
        return em.merge(consumation);
    }

    @Transactional
    public void delete(long id) {
        em.remove(findById(id));
    }


    public Consumation findByDateAndPerson(LocalDate myDate, Person person) {

        return em.createQuery("select c from Consumation c where " +
                "c.date = :DATE AND " +
                "c.person.id = :ID", Consumation.class)
                .setParameter("DATE", myDate)
                .setParameter("ID", person.getId())
                .getSingleResult();
    }




}
