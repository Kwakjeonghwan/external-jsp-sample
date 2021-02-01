package me.junjin.jspsample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements CommandLineRunner {

    private final ServletWebServerApplicationContext applicationContext;

    public TestRunner(ServletWebServerApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public void run(String... args) throws Exception {
        String contextPath = applicationContext.getServletContext().getContextPath();
        System.out.println("applicationContext = " + applicationContext);
    }
}
