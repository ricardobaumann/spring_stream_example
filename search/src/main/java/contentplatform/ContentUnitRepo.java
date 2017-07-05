package contentplatform;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContentUnitRepo extends MongoRepository<ContentUnit, String> {

    List<ContentUnit> findByBody(String body);

}
