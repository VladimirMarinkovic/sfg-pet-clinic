package vlada.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import vlada.springframework.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
