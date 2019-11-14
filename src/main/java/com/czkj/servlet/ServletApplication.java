package com.czkj.servlet;

import com.czkj.servlet.servlet.AServlet;
import com.czkj.servlet.servlet.BServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServletApplication.class, args);
    }

    @Bean
    public AServlet testServlet(){
        return new AServlet();
    }

    @Bean
    public ServletRegistrationBean testServletRegistrationBean(AServlet testServlet){
        ServletRegistrationBean registration = new ServletRegistrationBean(testServlet);
        registration.setEnabled(true);
        registration.addUrlMappings("/servlet/a");
        return registration;
    }
    /********************************************/
    @Bean
    public BServlet testServlet2(){
        return new BServlet();
    }

    @Bean
    public ServletRegistrationBean test2ServletRegistrationBean(BServlet testServlet2){
        ServletRegistrationBean registration = new ServletRegistrationBean(testServlet2);
        registration.setEnabled(true);
        registration.addUrlMappings("/servlet/b");
        return registration;
    }

}
