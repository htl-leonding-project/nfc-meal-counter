package at.htl.mealcounter.control;


import at.htl.mealcounter.entity.NfcCard;
import at.htl.mealcounter.entity.Person;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class NfcRepository implements PanacheRepository<NfcCard> {

    @Inject
    EntityManager em;

    @Inject
    PersonRepository personRepository;

//    @Transactional
//    public void checkedNfcCard(String nfcId) {
//        if(personRepository.findByNfcId(nfcId) == null) {
//            NfcCard nfcCard = new NfcCard();
//            em.persist(nfcCard);
//        }
//    }


//    public Person findByPersonId (Person person) {
//        return em.createQuery("select p from Person p where p.id = :id", Person.class)
//                .setParameter("id", person.getId()).getSingleResult();
//    }

//    public NfcCard findByNfcId (String nfcId) {
//        return em.createQuery("select P from Person p where p.nfcCard.nfcId = :id", NfcCard.class)
//                .setParameter("id", nfcId).getSingleResult();
//    }




}
