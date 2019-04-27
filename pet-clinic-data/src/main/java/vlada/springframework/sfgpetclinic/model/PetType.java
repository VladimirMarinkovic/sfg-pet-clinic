package vlada.springframework.sfgpetclinic.model;

public class PetType extends BaseEntity {

    private String naziv;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}
