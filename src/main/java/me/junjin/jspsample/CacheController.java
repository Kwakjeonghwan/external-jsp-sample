package me.junjin.jspsample;

import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.Servlet;
import java.util.Enumeration;

@RestController
public class CacheController {

    private final ServletWebServerApplicationContext applicationContext;

    public CacheController(ServletWebServerApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }
    /*@Autowired
    private CacheManager cacheManager;*/

    @GetMapping(value = "/clearCache")
    public void clearCache() {
        System.out.println("applicationContext = " + applicationContext);
    }
}
