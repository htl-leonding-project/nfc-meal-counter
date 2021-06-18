package at.htl.mealcounter.entity;

import javax.persistence.*;

@Entity
@Table(name = "M_PERSON")
@NamedQueries({
        @NamedQuery(
                name = "Person.findAll",
                query = "select p from Person p"
        ),
        @NamedQuery(
                name = "Person.findByClass",
                query = "select p from Person p where p.currentClassName = :classname"
        )
})

public class Person {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NFC_ID")
    private String nfcId;

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

    public Person(String nfcId, String firstName, String lastName, int entryYear, String currentClassName) {
        this.nfcId = nfcId;
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

    public String getNfcId() {
        return nfcId;
    }

    public void setNfcId(String nfcId) {
        this.nfcId = nfcId;
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
                ", nfcId='" + nfcId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", entryYear=" + entryYear +
                ", className='" + currentClassName + '\'' +
                '}';
    }
}
