package com.xinput;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by HP on 2017-05-30.
 */
@SpringBootApplication
@MapperScan(basePackages="com.xinput.dao")
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
