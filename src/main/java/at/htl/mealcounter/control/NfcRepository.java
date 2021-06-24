package at.htl.mealcounter.control;


import at.htl.mealcounter.entity.NfcCard;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

public class NfcRepository implements PanacheRepository<NfcCard> {

    @Inject
    EntityManager em;

    @Inject
    PersonRepository personRepository;

    @Transactional
    public NfcCard checkedNfcCard(String nfcId) {


        return null;
    }


}
