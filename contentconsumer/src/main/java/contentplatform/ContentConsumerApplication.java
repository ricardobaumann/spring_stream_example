package contentplatform;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableDiscoveryClient
@EnableScheduling
public class ContentConsumerApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(ContentConsumerApplication.class);

    public static void main(final String[] args) {
        System.setProperty("spring.config.name", "contentconsumer");
        SpringApplication.run(ContentConsumerApplication.class, args);
    }


    @StreamListener(ContentUnitsSink.CHANNEL_NAME)
    public void process(final ContentUnit workUnit) {
        LOGGER.info("Handling content - id: {}, definition: {}", workUnit.getId(), workUnit.getBody());
    }
}
