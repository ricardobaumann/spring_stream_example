package eventconsumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ContentUnitsSink {
    String CHANNEL_A = "channelA";

    @Input
    SubscribableChannel channelA();

}
