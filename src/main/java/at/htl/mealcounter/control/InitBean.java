package at.htl.mealcounter.control;


import at.htl.mealcounter.entity.Person;
import io.quarkus.runtime.StartupEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class InitBean {


    @Inject
    EntityManager em;

    @Transactional
    public void startUp(@Observes StartupEvent startupEvent) {
        Person brooke = new Person("Brooke", "Bradford", 2020, "1a");
        Person paula = new Person("Paula", "Zack", 2020, "1a");


        em.persist(brooke);
        em.persist(paula);





    }


}
