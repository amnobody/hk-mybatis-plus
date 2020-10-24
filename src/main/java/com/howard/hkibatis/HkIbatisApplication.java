package com.howard.hkibatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.howard.hkibatis.mapper")
public class HkIbatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(HkIbatisApplication.class, args);
	}

}
