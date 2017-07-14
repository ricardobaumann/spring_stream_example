package pusher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;

@SpringBootApplication
@EnableDiscoveryClient
@EnableScheduling
@EnableWebSocketMessageBroker
public class PusherApplication {

    public static void main(final String[] args) {
        System.setProperty("spring.config.name", "pusher");
        SpringApplication.run(PusherApplication.class, args);
    }

}
