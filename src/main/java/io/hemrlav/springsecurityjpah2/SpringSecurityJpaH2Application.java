package io.hemrlav.springsecurityjpah2;

import io.hemrlav.springsecurityjpah2.repository.UserDetailsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackageClasses = UserDetailsRepository.class) // this is not mandatory if repositories are in child package of main class
@SpringBootApplication
public class SpringSecurityJpaH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJpaH2Application.class, args);
	}

}
