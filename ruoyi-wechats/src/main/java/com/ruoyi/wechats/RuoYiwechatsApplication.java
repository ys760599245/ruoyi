package com.ruoyi.wechats;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author ruoyi
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class RuoYiwechatsApplication {
    public static void main(String[] args) {
        SpringApplication.run(RuoYiwechatsApplication.class, args);
    }

}