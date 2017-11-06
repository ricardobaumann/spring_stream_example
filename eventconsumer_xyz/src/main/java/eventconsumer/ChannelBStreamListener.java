package eventconsumer;

import eventsource.Message;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class ChannelBStreamListener implements Loggable {

    @StreamListener(ContentUnitsSink.CHANNEL_B)
    public void process(final Message message) {
        logger().info("Handling content for channel B- id: {}, definition: {}", message.getId(), message.getBody());
    }
}
