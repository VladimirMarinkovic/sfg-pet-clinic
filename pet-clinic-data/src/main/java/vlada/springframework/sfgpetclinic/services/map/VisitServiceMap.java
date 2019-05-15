package vlada.springframework.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import vlada.springframework.sfgpetclinic.model.Visit;
import vlada.springframework.sfgpetclinic.services.VisitService;

import java.util.Set;

@Service
public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.finAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit visit) {
        if (visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null
                || visit.getPet().getOwner().getId() == null) { throw new RuntimeException("Nepostojeca poseta"); }
        return super.save(visit);
    }

    @Override
    public void delete(Visit visit) {
        super.delete(visit);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}
