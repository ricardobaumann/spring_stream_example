package pusher;

import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class MessageController {

    @SendTo("/topic/greetings")
    public Greeting greeting(final ContentUnit contentUnit) throws Exception {
        return new Greeting("Hello, " + contentUnit.getBody() + "!");
    }
}
