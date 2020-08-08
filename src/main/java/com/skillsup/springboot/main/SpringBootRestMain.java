package com.skillsup.springboot.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.skillsup.springboot")
@EnableJpaRepositories(basePackages = "com.skillsup.springboot.db")
@EntityScan(basePackages = "com.skillsup.springboot.db.entity")
public class SpringBootRestMain {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestMain.class);
    }

}
