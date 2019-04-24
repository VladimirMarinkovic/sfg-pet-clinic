package vlada.springframework.sfgpetclinic.services;

import vlada.springframework.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByPrezime(String prezime);

    // Dodate metode preko interfejsa CrudService
           // Owner findById(Long id);
           // Owner save(Owner owner);
           // Set<Owner> findAll();
}
