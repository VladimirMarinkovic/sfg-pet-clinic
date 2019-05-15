package vlada.springframework.sfgpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity {

    public Person(Long id,String ime, String prezime) {
        super(id);
        this.ime = ime;
        this.prezime = prezime;
    }

    @Column(name = "ime")
    String ime;

    @Column(name = "prezime")
    String prezime;


}
