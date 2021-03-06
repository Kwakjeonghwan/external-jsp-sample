package me.junjin.jspsample;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
// SpringBoot JSP 외부에 DocumentRoot 설정 방법
public class CustomContainer implements WebServerFactoryCustomizer<TomcatServletWebServerFactory> {
    @Override
    public void customize(TomcatServletWebServerFactory factory) {
        factory.setDocumentRoot(new File("/Users/jeonghwankwak/view_test"));
    }
}
