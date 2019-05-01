package vlada.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import vlada.springframework.sfgpetclinic.model.Speciality;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
