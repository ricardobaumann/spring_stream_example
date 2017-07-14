package pusher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class ContentConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(ContentConsumer.class);
    private final MessageController messageController;

    ContentConsumer(final MessageController messageController) {
        this.messageController = messageController;
    }

    @StreamListener(ContentUnitsSink.CHANNEL_NAME)
    public void process(final ContentUnit workUnit) {
        LOGGER.info("Handling content - id: {}, definition: {}", workUnit.getId(), workUnit.getBody());
        messageController.broacast(workUnit.getBody());
    }

}
