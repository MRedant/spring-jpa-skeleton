package be.niels.jpaskeleton.repository.division;

import be.niels.jpaskeleton.domain.division.Division;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class DivisionRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Division save(Division division) {
        entityManager.persist(division);
        return division;
    }
}
