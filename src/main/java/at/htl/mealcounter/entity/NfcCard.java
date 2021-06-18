package at.htl.mealcounter.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class NfcCard {

    public String nfcId;
    public LocalDateTime registerDateTime;

    public NfcCard(String nfcId) {
        this.nfcId = nfcId;
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
