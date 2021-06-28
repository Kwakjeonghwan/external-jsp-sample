package me.junjin.jspsample.site;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SiteTest {

    @PostConstruct
    public void postService() {
        System.out.println("SiteTest postconstruct");
    }
}
