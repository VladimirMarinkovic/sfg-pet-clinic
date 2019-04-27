package vlada.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Visit extends BaseEntity {

    private LocalDate datum;
    private String opis;
    private Pet pet;

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
