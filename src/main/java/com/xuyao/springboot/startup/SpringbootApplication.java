package com.xuyao.springboot.startup;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DruidDataSourceAutoConfigure.class})
@ComponentScan("com.xuyao.springboot")
@MapperScan("com.xuyao.springboot.dao")
public class SpringbootApplication {

	public static void main(String[] args) {
		new SpringApplication(SpringbootApplication.class).run(args);
	}

}
