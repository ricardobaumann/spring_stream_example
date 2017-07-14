package pusher;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MessageController {

    private List<SseEmitter> emitters = new ArrayList<>();

    @GetMapping("/messages")
    public SseEmitter handle() {
        final SseEmitter emitter = new SseEmitter();
        this.emitters.add(emitter);

        emitter.onCompletion(() -> this.emitters.remove(emitter));
        emitter.onTimeout(() -> this.emitters.remove(emitter));
        try {
            emitter.send("test");
        } catch (final IOException e) {
            e.printStackTrace();
        }
        return emitter;
    }

    public void broacast(final String message) {
        emitters.forEach(sseEmitter -> {
            try {
                sseEmitter.send(message);
            } catch (final IOException e) {
                e.printStackTrace();
            }
        });
    }
}
