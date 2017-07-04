package contentplatform;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface ContentSource {
    String CHANNEL_NAME = "contentChannel";

    @Output
    MessageChannel contentChannel();
}
