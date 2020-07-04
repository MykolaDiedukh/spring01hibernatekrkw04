package pl.coderslab.spring01hibernatekrkw04.dao;

import org.springframework.stereotype.Repository;
import pl.coderslab.spring01hibernatekrkw04.entity.PersonDetails;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class PersonDetailsDao {

    //    - zapis encji
    @PersistenceContext
    EntityManager entityManager;

    public void savePersonDetails(PersonDetails personDetails) {
        entityManager.persist(personDetails);
    }

    //- edycja encji
    public void update(PersonDetails personDetails) {
        entityManager.merge(personDetails);
    }

    //- pobieranie po id
    public PersonDetails findById(long id) {
        return entityManager.find(PersonDetails.class, id);
    }

    //- usuwanie po id
    public void delete(PersonDetails personDetails) {
        entityManager.remove(entityManager.contains(personDetails) ? personDetails : entityManager.merge(personDetails));
    }
}
