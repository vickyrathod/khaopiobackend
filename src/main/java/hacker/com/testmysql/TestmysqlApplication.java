package hacker.com.testmysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("hacker.com.model")
@EnableJpaRepositories(basePackages="hacker.com.repository")
@SpringBootApplication
public class TestmysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestmysqlApplication.class, args);
	}
}