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
import java.util.ArrayList;
import java.util.List;

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

//        personRepository.readFromCsv();
//
//        Person brooke = new Person("Brooke", "Bradford", 2020, "1a");
//        Person paula = new Person("Paula", "Zack", 2020, "1a");
//        Person franz = new Person("Franz", "Zack", 2020, "1a");
//
//
//        em.persist(brooke);
//        em.persist(paula);
//
//        consumationRepository.readFromCsv();
//
//        Consumation consumation1 = new Consumation(brooke, LocalDate.of(2021,1,8),true);
//        Consumation consumation2 = new Consumation(brooke, LocalDate.of(2021,1,9),false);
//        Consumation consumation3 = new Consumation(brooke, LocalDate.of(2021,1,10),true);
//
//        em.persist(consumation1);
//        em.persist(consumation2);
//        em.persist(consumation3);

        fillWithTestData();
    }

    public void fillWithTestData(){

        List<Person> personList = new ArrayList<>();

        Person musterfrau1 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau2 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau3 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau4 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau5 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau6 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau7 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau8 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau9 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau10 = new Person("nfcID","Andrea","Maus",2018,"1c");

        Person musterfrau11 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau12 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau13 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau14 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau15 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau16 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau17 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau18 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau19 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau20 = new Person("nfcID","Andrea","Maus",2018,"1c");

        Person musterfrau21 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau22 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau23 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau24 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau25 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau26 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau27 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau28 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau29 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau30 = new Person("nfcID","Andrea","Maus",2018,"1c");

        Person musterfrau31 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau32 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau33 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau34 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau35 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau36 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau37 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau38 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau39 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau40 = new Person("nfcID","Andrea","Maus",2018,"1c");

        Person musterfrau41 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau42 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau43 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau44 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau45 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau46 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau47 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau48 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau49 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau50 = new Person("nfcID","Andrea","Maus",2018,"1c");


        Person musterfrau51 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau52 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau53 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau54 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau55 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau56 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau57 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau58 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau59 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau60 = new Person("nfcID","Andrea","Maus",2018,"1c");

        Person musterfrau61 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau62 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau63 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau64 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau65 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau66 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau67 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau68 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau69 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau70 = new Person("nfcID","Andrea","Maus",2018,"1c");

        Person musterfrau71 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau72 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau73 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau74 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau75 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau76 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau77 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau78 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau79 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau80 = new Person("nfcID","Andrea","Maus",2018,"1c");

        Person musterfrau81 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau82 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau83 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau84 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau85 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau86 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau87 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau88 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau89 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau90 = new Person("nfcID","Andrea","Maus",2018,"1c");

        Person musterfrau91 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau92 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau93 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau94 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau95 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau96 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau97 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau98 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau99 = new Person("nfcID","Andrea","Maus",2018,"1c");
        Person musterfrau100 = new Person("nfcID","Andrea","Maus",2018,"1c");


        personList.add(musterfrau1);
        personList.add(musterfrau2);
        personList.add(musterfrau3);
        personList.add(musterfrau4);
        personList.add(musterfrau5);
        personList.add(musterfrau6);
        personList.add(musterfrau7);
        personList.add(musterfrau8);
        personList.add(musterfrau9);
        personList.add(musterfrau10);
        personList.add(musterfrau11);
        personList.add(musterfrau12);
        personList.add(musterfrau13);
        personList.add(musterfrau14);
        personList.add(musterfrau15);
        personList.add(musterfrau16);
        personList.add(musterfrau17);
        personList.add(musterfrau18);
        personList.add(musterfrau19);
        personList.add(musterfrau20);
        personList.add(musterfrau21);
        personList.add(musterfrau22);
        personList.add(musterfrau23);
        personList.add(musterfrau24);
        personList.add(musterfrau25);
        personList.add(musterfrau26);
        personList.add(musterfrau27);
        personList.add(musterfrau28);
        personList.add(musterfrau29);
        personList.add(musterfrau30);
        personList.add(musterfrau31);
        personList.add(musterfrau32);
        personList.add(musterfrau33);
        personList.add(musterfrau34);
        personList.add(musterfrau35);
        personList.add(musterfrau36);
        personList.add(musterfrau37);
        personList.add(musterfrau38);
        personList.add(musterfrau39);
        personList.add(musterfrau40);
        personList.add(musterfrau41);
        personList.add(musterfrau42);
        personList.add(musterfrau43);
        personList.add(musterfrau44);
        personList.add(musterfrau45);
        personList.add(musterfrau46);
        personList.add(musterfrau47);
        personList.add(musterfrau48);
        personList.add(musterfrau49);
        personList.add(musterfrau50);
        personList.add(musterfrau51);
        personList.add(musterfrau52);
        personList.add(musterfrau53);
        personList.add(musterfrau54);
        personList.add(musterfrau55);
        personList.add(musterfrau56);
        personList.add(musterfrau57);
        personList.add(musterfrau58);
        personList.add(musterfrau59);
        personList.add(musterfrau60);
        personList.add(musterfrau61);
        personList.add(musterfrau62);
        personList.add(musterfrau63);
        personList.add(musterfrau64);
        personList.add(musterfrau65);
        personList.add(musterfrau66);
        personList.add(musterfrau67);
        personList.add(musterfrau68);
        personList.add(musterfrau69);
        personList.add(musterfrau70);
        personList.add(musterfrau71);
        personList.add(musterfrau72);
        personList.add(musterfrau73);
        personList.add(musterfrau74);
        personList.add(musterfrau75);
        personList.add(musterfrau76);
        personList.add(musterfrau77);
        personList.add(musterfrau78);
        personList.add(musterfrau79);
        personList.add(musterfrau80);
        personList.add(musterfrau81);
        personList.add(musterfrau82);
        personList.add(musterfrau83);
        personList.add(musterfrau84);
        personList.add(musterfrau85);
        personList.add(musterfrau86);
        personList.add(musterfrau87);
        personList.add(musterfrau88);
        personList.add(musterfrau89);
        personList.add(musterfrau90);
        personList.add(musterfrau91);
        personList.add(musterfrau92);
        personList.add(musterfrau93);
        personList.add(musterfrau94);
        personList.add(musterfrau95);
        personList.add(musterfrau96);
        personList.add(musterfrau97);
        personList.add(musterfrau98);
        personList.add(musterfrau99);
        personList.add(musterfrau100);

        for (Person person : personList) {
            em.persist(person);
            personRepository.save(person);
        }






    }


}
