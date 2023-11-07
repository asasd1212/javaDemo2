package cn.tbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//
@EnableAutoConfiguration
@ComponentScan(basePackages = "cn.tbs")
//@SpringBootApplication
public class SpApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpApplication.class);
    }
}
