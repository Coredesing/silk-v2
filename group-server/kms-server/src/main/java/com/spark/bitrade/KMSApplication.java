package com.spark.bitrade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
//import org.springframework.scheduling.annotation.EnableAsync;
//import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Zhang Jinwei
 * @date 2018年02月06日
 */
//@EnableAsync
@EnableDiscoveryClient
//@EnableSwagger2
//@EnableScheduling
//@EnableAutoConfiguration
//@EnableTransactionManagement(order = 10) //开启事务，并设置order值，默认是Integer的最大值
////@ComponentScan(basePackages={"com.spark.bitrade"})
@SpringBootApplication
//@EnableCaching
//@ServletComponentScan("com.spark.bitrade.config") //开启Druid监控
@EnableFeignClients
public class KMSApplication {
    public static void main(String[] args) {
        SpringApplication.run(KMSApplication.class, args);
    }
}
