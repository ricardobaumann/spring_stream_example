package eventsource;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface ContentSource {
    String CHANNEL_A = "channelA";
    String CHANNEL_B = "channelB";

    @Output
    MessageChannel channelA();

    @Output
    MessageChannel channelB();
}
