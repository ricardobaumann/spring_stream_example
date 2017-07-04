package contentplatform;

import org.springframework.stereotype.Repository;

@Repository
public class CacheRepo {

    private final ContentUnitRepo contentUnitRepo;

    CacheRepo(final ContentUnitRepo contentUnitRepo) {
        this.contentUnitRepo = contentUnitRepo;
    }

    void save(final ContentUnit contentUnit) {
        contentUnitRepo.save(contentUnit);
    }

    ContentUnit get(final String id) {
        return contentUnitRepo.findOne(id);
    }

}
