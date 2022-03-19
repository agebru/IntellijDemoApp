package com.app.demoapp;

import com.app.demoapp.controller.HomeController;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.assertj.core.api.Assertions.assertThat;

import javax.annotation.PostConstruct;

@SpringBootTest
class DemoAppApplicationTests {
    //	@Autowired
    //private TestRestTemplate template;
    @Autowired
    private HomeController homeController;

    @Autowired
    private Doctor doctor;

    @Test
    public void testDoctor() {
        doctor.setQualification("Surgeon");
        System.out.println(doctor);
        doctor.assist();

        assertThat(doctor.getQualification()).isNotNull();
        // assertthat(doctor.getQualification()


    }

    @Test
    void contextLoads() {
        ConfigurableApplicationContext context = SpringApplication.run(DemoAppApplicationTests.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames) {
            System.out.println(beanName);
        }
        homeController.findPrimesTillN(10);
    }


    public void testFactor() {

    }


    @Bean
    ServletWebServerFactory servletWebServerFactory() {
        return new TomcatServletWebServerFactory();
    }

    @Bean
    TestRestTemplate restTemplate() {
        return new TestRestTemplate();
    }
}
