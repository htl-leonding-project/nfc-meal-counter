package at.htl.mealcounter.control;


import at.htl.mealcounter.entity.Consumation;
import at.htl.mealcounter.entity.Person;
import io.quarkus.runtime.StartupEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.time.LocalDate;

@ApplicationScoped
public class InitBean {


    @Inject
    EntityManager em;

    @Inject
    PersonRepository personRepository;

    @Inject
    ConsumationRepository consumationRepository;

    @Transactional
    public void startUp(@Observes StartupEvent startupEvent) {

        personRepository.readFromCsv();

        Person brooke = new Person("Brooke", "Bradford", 2020, "1a");
        Person paula = new Person("Paula", "Zack", 2020, "1a");
        Person franz = new Person("Franz", "Zack", 2020, "1a");


        em.persist(brooke);
        em.persist(paula);

        consumationRepository.readFromCsv();

        Consumation consumation1 = new Consumation(brooke, LocalDate.of(2021,1,8),true);
        Consumation consumation2 = new Consumation(brooke, LocalDate.of(2021,1,9),false);
        Consumation consumation3 = new Consumation(brooke, LocalDate.of(2021,1,10),true);

        em.persist(consumation1);
        em.persist(consumation2);
        em.persist(consumation3);
    }


}
