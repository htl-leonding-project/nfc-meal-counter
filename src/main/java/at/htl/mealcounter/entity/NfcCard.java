package at.htl.mealcounter.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class NfcCard extends PanacheEntity {

    @Id
    public String nfcId;
    public LocalDateTime registerDateTime;

    public NfcCard(String nfcId) {
        this.nfcId = nfcId;
    }

    public NfcCard() {

    }

    public NfcCard(LocalDateTime registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    public String getNfcId() {
        return nfcId;
    }

    public void setNfcId(String nfcId) {
        this.nfcId = nfcId;
    }

    public LocalDateTime getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(LocalDateTime registerDateTime) {
        this.registerDateTime = registerDateTime;
    }


}
