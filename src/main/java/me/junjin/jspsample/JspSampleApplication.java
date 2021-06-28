package me.junjin.jspsample;

import me.junjin.jspsample.annotation.AdminComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

//@SpringBootApplication
@SpringBootConfiguration
@EnableAutoConfiguration
//@ComponentScan(basePackages = {"me.junjin.jspsample.configuration"})
public class JspSampleApplication extends SpringBootServletInitializer {

    public static final String SITE_BASE_PACKAGE = "me.junjin.jspsample.site";
    public static final String ADMIN_BASE_PACKAGE = "me.junjin.jspsample.admin";

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(JspSampleApplication.class);
    }

    public static void main(String[] args) {




        System.out.println("JspSampleApplication start =============");
        SpringApplication.run(JspSampleApplication.class, args);
    }

    @Configuration
    /*@ConditionalOnProperty(value="run.mode", havingValue = "admin", matchIfMissing = true)
    @ComponentScan(basePackages = {ADMIN_BASE_PACKAGE})*/
    @AdminComponentScan
    public static class AdminConfiguration {
        @PostConstruct
        private void print() {
            System.out.println("AdminConfiguration print");
        }
    }

    @Configuration
    @ConditionalOnProperty(value="run.mode", havingValue = "site", matchIfMissing = true)
    @ComponentScan(basePackages = {SITE_BASE_PACKAGE})
    public static class SiteConfiguration {
        @PostConstruct
        private void print() {
            System.out.println("SiteConfiguration print");
        }
    }

    /*@Configuration
    @ConditionalOnProperty(value="run.mode", havingValue = "all")
    @ComponentScan(basePackages = {ADMIN_BASE_PACKAGE, SITE_BASE_PACKAGE})
    public static class SiteAndAdminConfiguration {
        @PostConstruct
        private void print() {
            System.out.println("SiteAndAdminConfiguration print");
        }
    }*/


}
