package contentplatform;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
public interface ContentUnitGateway {
    @Gateway(requestChannel = ContentSource.CHANNEL_NAME)
    void generate(ContentUnit contentUnit);

}
