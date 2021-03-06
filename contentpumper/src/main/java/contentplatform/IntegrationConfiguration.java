package contentplatform;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;

@Configuration
@EnableBinding(ContentSource.class)
@IntegrationComponentScan
public class IntegrationConfiguration {
}
