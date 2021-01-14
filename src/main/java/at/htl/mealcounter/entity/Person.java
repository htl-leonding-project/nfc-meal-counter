package at.htl.mealcounter.entity;


import javax.persistence.*;

@Entity
@Table(name = "PERSON")
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

    @Column(name = "YEAR")
    private int year;

    @Column(name = "CLASS_NAME")
    private String className;

    public Person() {
    }

    public Person(String firstName, String lastName, int year, String className) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.className = className;
    }

    //region getter and setter
    public Long getId() {
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
                ", year=" + year +
                ", className='" + className + '\'' +
                '}';
    }
}
