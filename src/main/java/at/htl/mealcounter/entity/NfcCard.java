package at.htl.mealcounter.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "M_NFC_CARD")
public class NfcCard extends PanacheEntity {

    @Id
    @Column(name = "NFC_ID")
    public String nfcId;

    @Column(name = "REGISTER_DATE_TIME")
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
