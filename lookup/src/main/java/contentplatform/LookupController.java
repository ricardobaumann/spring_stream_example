package contentplatform;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LookupController {


    private final CacheRepo cacheRepo;

    LookupController(final CacheRepo cacheRepo) {
        this.cacheRepo = cacheRepo;
    }

    @GetMapping("content/{id}")
    public Object get(@PathVariable final String id) {
        return cacheRepo.get(id);
    }

}
