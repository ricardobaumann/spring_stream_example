package eventconsumer;

import eventsource.Message;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class ChannelAStreamListener implements Loggable {

    @StreamListener(ContentUnitsSink.CHANNEL_A)
    public void process(final Message message) {
        logger().info("Handling content for channel A- id: {}, definition: {}", message.getId(), message.getBody());
    }

}
