package com.lz.lu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EnrekaServiceApplication {

    public static final String BOOT_DEMO2;

    static {
        BOOT_DEMO2 = "BOOT";
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        SpringApplication.run(EnrekaServiceApplication.class, args);
    }
}
