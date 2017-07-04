package contentplatform;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CacheRepo {

    private Map<String, ContentUnit> unitMap = new HashMap<>();

    void save(final ContentUnit contentUnit) {
        unitMap.put(contentUnit.getId(), contentUnit);
    }

    ContentUnit get(final String id) {
        return unitMap.get(id);
    }

}
