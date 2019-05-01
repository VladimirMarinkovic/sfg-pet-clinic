package vlada.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import vlada.springframework.sfgpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
