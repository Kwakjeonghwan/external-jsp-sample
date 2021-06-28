package me.junjin.jspsample.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ConditionalOnProperty(value="run.mode", havingValue = "service")
public class ServiceConfiguration {

    @Bean String serviceString() {
        System.out.println("========== service mode run ===============");
        return "service mode run";
    }

}
