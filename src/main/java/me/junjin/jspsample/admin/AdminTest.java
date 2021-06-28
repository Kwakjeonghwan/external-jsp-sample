package me.junjin.jspsample.admin;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AdminTest {

    @PostConstruct
    public void postService() {
        System.out.println("AdminTest postconstruct");
    }
}
