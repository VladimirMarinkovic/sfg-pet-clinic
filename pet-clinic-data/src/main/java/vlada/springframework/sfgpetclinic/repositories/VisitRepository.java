package vlada.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import vlada.springframework.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
