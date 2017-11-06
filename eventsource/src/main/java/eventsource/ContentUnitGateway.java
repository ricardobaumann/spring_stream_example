package eventsource;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
public interface ContentUnitGateway {
    @Gateway(requestChannel = ContentSource.CHANNEL_A)
    void generateFoChannelA(Message message);

    @Gateway(requestChannel = ContentSource.CHANNEL_B)
    void generateFoChannelB(Message message);

}
