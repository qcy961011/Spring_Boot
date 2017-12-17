package com.mi.qiao;

import java.nio.charset.Charset;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;

@SpringBootApplication
@MapperScan("com.mi.qiao.dao")
public class SpringBootLearningApplication {

	// 更改全局编码格式
	@Bean
	public StringHttpMessageConverter stringHttpMessageConverter() {
		StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
		return converter;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLearningApplication.class, args);
	}
}
