package contentplatform;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.Ignition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IgniteCacheConfig {

    @Bean
    Ignite ignition() {
        return Ignition.start();
    }

    @Bean
    IgniteCache<String, String> igniteCache(final Ignite ignite) {
        return ignite.getOrCreateCache("lookup");
    }

}
