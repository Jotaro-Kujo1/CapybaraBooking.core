package capybarabooking.core.repositories;

import capybarabooking.core.models.Sysname;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysnameRepository extends CrudRepository<Sysname, String> {

    Sysname findAllByName(String name);

    Sysname findAllByHbdataverid(Integer hbdataverid);
}
