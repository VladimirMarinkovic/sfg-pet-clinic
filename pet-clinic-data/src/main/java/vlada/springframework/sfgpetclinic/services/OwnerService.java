package vlada.springframework.sfgpetclinic.services;

import vlada.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByPrezime(String prezime);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
