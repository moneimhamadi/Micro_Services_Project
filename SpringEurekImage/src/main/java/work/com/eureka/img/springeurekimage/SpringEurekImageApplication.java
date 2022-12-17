package work.com.eureka.img.springeurekimage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient    // Enable eureka client. It inherits from @EnableDiscoveryClient.

public class SpringEurekImageApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekImageApplication.class, args);
	}

}
