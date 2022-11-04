package com.securelogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses=userRepository.class)
public class SecureloginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureloginApplication.class, args);
	}

}
