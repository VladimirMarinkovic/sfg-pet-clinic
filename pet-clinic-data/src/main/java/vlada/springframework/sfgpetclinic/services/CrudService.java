package vlada.springframework.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {                     // CrudRepository

    Set<T> findAll();                                     // Vraca tip

    T findById(ID id);

    T save(T object);                                     // Genericka klasa tip

    void delete(T object);

    void deleteById(ID id);
}
