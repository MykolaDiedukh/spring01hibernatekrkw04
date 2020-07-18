package pl.coderslab.spring01hibernatekrkw04.dao;

import org.springframework.stereotype.Repository;
import pl.coderslab.spring01hibernatekrkw04.entity.Author;
import pl.coderslab.spring01hibernatekrkw04.entity.Publisher;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class AuthorDao {

    //    - zapis encji
    @PersistenceContext
    EntityManager entityManager;

    public void saveAuthor(Author author) {
        entityManager.persist(author);
    }

    //- edycja encji
    public void update(Author author) {
        entityManager.merge(author);
    }

    //- pobieranie po id
    public Author findById(long id) {
        return entityManager.find(Author.class, id);
    }

    //- usuwanie po id
    public void delete(Author author) {
        entityManager.remove(entityManager.contains(author) ? author : entityManager.merge(author));
    }

    public List<Author> getAll(){
        Query query = this.entityManager.createQuery("SELECT a FROM Author a");
        return query.getResultList();
    }
}
