package vlada.springframework.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import vlada.springframework.sfgpetclinic.model.Speciality;
import vlada.springframework.sfgpetclinic.services.SpecialitiesService;

import java.util.Set;

@Service
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialitiesService {


    @Override
    public Set<Speciality> findAll() {
        return super.finAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
