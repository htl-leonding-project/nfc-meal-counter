package at.htl.mealcounter.entity;
import javax.persistence.*;
import at.htl.mealcounter.entity.NfcCard;
import io.quarkus.hibernate.orm.panache.PanacheEntity;


@Entity
@Table(name = "M_PERSON")

public class Person extends PanacheEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    NfcCard nfcCard;

    @ManyToOne
    Consumation consumation;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "ENTRY_YEAR")
    private int entryYear;  // eintrittsjahr

    @Column(name = "CLASS_NAME")
    private String currentClassName;

    public Person() {
    }

    public Person(String firstName, String lastName, int entryYear, String currentClassName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.entryYear = entryYear;
        this.currentClassName = currentClassName;
    }

    public Person(NfcCard nfcCard, String firstName, String lastName, int entryYear, String currentClassName) {
        this.nfcCard = nfcCard;
        this.firstName = firstName;
        this.lastName = lastName;
        this.entryYear = entryYear;
        this.currentClassName = currentClassName;
    }

    //region getter and setter
    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NfcCard getNfcCard() {
        return nfcCard;
    }

    public void setNfcCard(NfcCard nfcCard) {
        this.nfcCard = nfcCard;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getentryYear() {
        return entryYear;
    }

    public void setentryYear(int entryYear) {
        this.entryYear = entryYear;
    }

    public String getCurrentClassName() {
        return currentClassName;
    }

    public void setCurrentClassName(String className) {
        this.currentClassName = className;
    }
    //endregion


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", nfcCard='" + nfcCard + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", entryYear=" + entryYear +
                ", className='" + currentClassName + '\'' +
                '}';
    }
}
