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
                query = "select p from Person p where p.className = :classname"
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

    @Column(name = "YEARNO")
    private int yearno;

    @Column(name = "CLASS_NAME")
    private String className;

    public Person() {
    }

    public Person(String firstName, String lastName, int yearno, String className) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearno = yearno;
        this.className = className;
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

    public int getYearno() {
        return yearno;
    }

    public void setYearno(int yearno) {
        this.yearno = yearno;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    //endregion


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", nfcId='" + nfcId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + yearno +
                ", className='" + className + '\'' +
                '}';
    }
}
