package at.htl.mealcounter.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "CONSUMATION")
@NamedQueries({
        @NamedQuery(
                name = "Consumation.findAll",
                query = "select c from Consumation c"
        )
})

public class Consumation {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "PERSON_ID")
    private Person person;

    @Column(name = "DATE")
    private LocalDate date;

    @Column(name = "HASCONSUMED")
    private boolean hasConsumed;

    public Consumation() {
    }

    public Consumation(Person person, LocalDate date, boolean hasConsumed) {
        this.person = person;
        this.date = date;
        this.hasConsumed = hasConsumed;
    }

    //region getter and setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isHasConsumed() {
        return hasConsumed;
    }

    public void setHasConsumed(boolean hasConsumed) {
        this.hasConsumed = hasConsumed;
    }
    //endregion


    @Override
    public String toString() {
        return "Consumation{" +
                "person=" + person +
                ", date=" + date +
                ", hasConsumed=" + hasConsumed +
                '}';
    }
}
