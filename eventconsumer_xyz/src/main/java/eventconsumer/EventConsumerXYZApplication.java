package eventconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableDiscoveryClient
@EnableScheduling
public class EventConsumerXYZApplication {

    public static void main(final String[] args) {
        System.setProperty("spring.config.name", "eventconsumer_xyz");
        SpringApplication.run(EventConsumerXYZApplication.class, args);
    }
}
