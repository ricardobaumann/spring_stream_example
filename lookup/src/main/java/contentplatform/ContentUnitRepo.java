package contentplatform;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentUnitRepo extends CrudRepository<ContentUnit, String> {
}
