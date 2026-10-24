package com.drugrag;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.drugrag.mapper")
public class DrugRagApplication {
    public static void main(String[] args) {
        SpringApplication.run(DrugRagApplication.class, args);
        System.out.println("==========================================");
        System.out.println("  代表项目启动成功！");
        System.out.println("  访问 http://localhost:8080/h2-console");
        System.out.println("==========================================");
    }
}