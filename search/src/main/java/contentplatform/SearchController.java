package contentplatform;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, path = "search")
public class SearchController {

    private final ContentUnitRepo contentUnitRepo;

    SearchController(final ContentUnitRepo contentUnitRepo) {
        this.contentUnitRepo = contentUnitRepo;
    }

    @GetMapping
    public List<ContentUnit> search(@RequestParam(name = "body") final String body) {
        return contentUnitRepo.findByBody(body);
    }

}
