package com.ps.educational;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.ps.educational.data.dao.")
@SpringBootApplication(scanBasePackages  = {"com.ps.educational"})
public class EducationalApplication {

    public static void main(String[] args) {
        SpringApplication.run(EducationalApplication.class, args);
    }

}
