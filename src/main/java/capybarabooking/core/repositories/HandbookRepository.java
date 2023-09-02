package capybarabooking.core.repositories;

import capybarabooking.core.models.Handbook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HandbookRepository extends CrudRepository<Handbook, Integer> {

    Handbook findAllByHbdataverid(Integer hbdataverid);
}
