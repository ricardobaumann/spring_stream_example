package contentplatform;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ContentUnitsSink {
    String CHANNEL_NAME = "contentChannel";

    @Input
    SubscribableChannel contentChannel();
}
