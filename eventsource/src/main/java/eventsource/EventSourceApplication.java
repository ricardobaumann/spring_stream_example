package eventsource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.concurrent.atomic.AtomicInteger;

@SpringBootApplication
@EnableScheduling
@EnableDiscoveryClient
public class EventSourceApplication implements Loggable {

    private ContentUnitGateway contentUnitGateway;
    private static final AtomicInteger ATOMIC_INTEGER = new AtomicInteger();

    EventSourceApplication(final ContentUnitGateway contentUnitGateway) {
        this.contentUnitGateway = contentUnitGateway;
    }

    public static void main(final String[] args) {
        System.setProperty("spring.config.name", "eventsource");
        SpringApplication.run(EventSourceApplication.class, args);
    }

    @Scheduled(fixedDelay = 1000)
    public void pump() {
        contentUnitGateway.generateFoChannelA(new Message(id(), "test message for channel A"));
        contentUnitGateway.generateFoChannelB(new Message(id(), "test message for channel B"));
        final Integer sameId = id();
        contentUnitGateway.generateFoChannelA(new Message(sameId, "test message for both channels"));
        contentUnitGateway.generateFoChannelB(new Message(sameId, "test message for both channels"));
    }

    private Integer id() {
        return ATOMIC_INTEGER.getAndIncrement();
    }
}
