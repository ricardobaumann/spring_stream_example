package contentplatform;

import org.apache.ignite.IgniteCache;
import org.springframework.stereotype.Repository;

@Repository
public class CacheRepo {

    private final IgniteCache<String, String> igniteCache;

    CacheRepo(final IgniteCache<String, String> igniteCache) {
        this.igniteCache = igniteCache;
    }

    void save(final ContentUnit contentUnit) {
        igniteCache.put(contentUnit.getId(), contentUnit.getBody());
    }

    ContentUnit get(final String id) {
        return new ContentUnit(id, igniteCache.get(id));
    }

}
