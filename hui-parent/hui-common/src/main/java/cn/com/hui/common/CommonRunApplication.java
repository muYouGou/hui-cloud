package cn.com.hui.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author goupe
 * @info common工具类
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CommonRunApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonRunApplication.class, args);
    }
}
