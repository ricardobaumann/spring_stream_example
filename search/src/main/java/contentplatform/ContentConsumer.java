package contentplatform;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class ContentConsumer {

    private final ContentUnitRepo contentUnitRepo;

    ContentConsumer(final ContentUnitRepo contentUnitRepo) {
        this.contentUnitRepo = contentUnitRepo;
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(ContentConsumer.class);

    @StreamListener(ContentUnitsSink.CHANNEL_NAME)
    public void process(final ContentUnit workUnit) {
        //LOGGER.info("Handling content - id: {}, definition: {}", workUnit.getId(), workUnit.getBody());
        contentUnitRepo.save(workUnit);
    }
}
