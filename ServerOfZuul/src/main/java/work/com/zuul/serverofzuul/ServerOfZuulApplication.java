package work.com.zuul.serverofzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient        // It acts as a eureka client
@EnableZuulProxy
@SpringBootApplication
public class ServerOfZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerOfZuulApplication.class, args);
	}

}
