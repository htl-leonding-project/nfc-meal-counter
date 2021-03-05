package at.htl.mealcounter.control;

import at.htl.mealcounter.entity.Consumation;
import at.htl.mealcounter.entity.Person;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.time.LocalDate;
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


    public Consumation findByDateAndPerson(LocalDate date, Person person) {
        return em.createQuery("select c from Consumation c where " +
                "c.date ='" + date + "' AND " +
                "c.person ='" + person + "'", Consumation.class).getSingleResult();
    }




}
