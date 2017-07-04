package contentplatform;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@EnableZuulProxy
@RestController
public class ProxyApplication {

    public static void main(String[] args) {
        // Tell server to look for registration.properties or registration.yml
        System.setProperty("spring.config.name", "proxy");

        new SpringApplicationBuilder(ProxyApplication.class).web(true).run(args);
    }

    @RequestMapping(method = RequestMethod.GET)
    public String test() {
        return "hello";
    }
}
