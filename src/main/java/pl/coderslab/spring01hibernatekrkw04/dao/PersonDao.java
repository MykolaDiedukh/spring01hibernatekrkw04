package pl.coderslab.spring01hibernatekrkw04.dao;

import org.springframework.stereotype.Repository;
import pl.coderslab.spring01hibernatekrkw04.entity.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class PersonDao {

    //    - zapis encji
    @PersistenceContext
    EntityManager entityManager;

    public void savePerson(Person person) {
        entityManager.persist(person);
    }

    //- edycja encji
    public void update(Person person) {
        entityManager.merge(person);
    }

    //- pobieranie po id
    public Person findById(long id) {
        return entityManager.find(Person.class, id);
    }

    //- usuwanie po id
    public void delete(Person person) {
        entityManager.remove(entityManager.contains(person) ? person : entityManager.merge(person));
    }
}
