package contentplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.UUID;

@SpringBootApplication
@EnableDiscoveryClient
@EnableScheduling
public class ContentPumperApplication {

    private final ContentUnitGateway contentUnitGateway;

    ContentPumperApplication(final ContentUnitGateway contentUnitGateway) {
        this.contentUnitGateway = contentUnitGateway;
    }

    public static void main(final String[] args) {
        System.setProperty("spring.config.name", "contentpumper");
        SpringApplication.run(ContentPumperApplication.class, args);
    }

    @Scheduled(fixedDelay = 1000)
    public void pump() {
        final String id = UUID.randomUUID().toString();
        contentUnitGateway.generate(new ContentUnit(id, String.format("body_%s", id)));
    }

}
