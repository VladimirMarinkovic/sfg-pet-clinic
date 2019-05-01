package vlada.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import vlada.springframework.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
