package net.p5w.consumer.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author tboss
 */
@EnableHystrix
@EnableFeignClients(basePackages = "net.p5w.user.feign.client")
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "net.p5w.*")
public class ConsumerUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerUserApplication.class, args);
	}
}