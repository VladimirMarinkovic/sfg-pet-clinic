package vlada.springframework.sfgpetclinic.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor

@Entity
@Table(name = "owners")
public class Owner extends Person {

    @Builder
    public Owner(Long id, String ime, String prezime, String adresa, String grad, String telefon, Set<Pet> pets) {
        super(id,ime, prezime);
        this.adresa = adresa;
        this.grad = grad;
        this.telefon = telefon;
        this.pets = pets;
    }

    @Column(name = "adresa")
    private String adresa;

    @Column(name = "grad")
    private String grad;

    @Column(name = "telefon")
    private String telefon;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();



}
