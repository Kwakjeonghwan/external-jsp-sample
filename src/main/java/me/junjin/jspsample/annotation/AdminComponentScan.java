package me.junjin.jspsample.annotation;

import me.junjin.jspsample.JspSampleApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.ComponentScan;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@ConditionalOnProperty(value="run.mode", havingValue = "admin", matchIfMissing = true)
@ComponentScan(basePackages = {JspSampleApplication.ADMIN_BASE_PACKAGE})
public @interface AdminComponentScan {
}
