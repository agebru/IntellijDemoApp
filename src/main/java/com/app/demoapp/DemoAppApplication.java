package com.app.demoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoAppApplication {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        SpringApplication.run(DemoAppApplication.class, args);

        //creating object using reflection
        Class c=Class.forName("com.app.demoapp.EnumApp");
        EnumApp instance = (EnumApp)c.newInstance();
        instance.hello();


    }

    @Bean
    public Doctor doctor(){
        return new Doctor();
    }



}
