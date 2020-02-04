package app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class ApplicationConfig {
    @Bean(name = "hello")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }
}
