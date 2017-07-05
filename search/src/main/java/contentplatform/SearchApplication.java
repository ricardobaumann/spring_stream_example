package contentplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableDiscoveryClient
@EnableScheduling
public class SearchApplication {

    public static void main(final String[] args) {
        System.setProperty("spring.config.name", "search");
        SpringApplication.run(SearchApplication.class, args);
    }
}
