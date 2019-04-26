package vlada.springframework.sfgpetclinic.services.map;

import vlada.springframework.sfgpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> finAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if(object != null) {
            if (object.getId() == null) { object.setId(getNextID()); }
            map.put(object.getId(), object);
        } else { throw new RuntimeException("Objekat ne moze biti null");}
        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }


    void delete(T object) {
        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(object));
    }

    private Long getNextID() {
        Long nextId = null;
        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextId = 1l;
        }
        return nextId;
    }

}
