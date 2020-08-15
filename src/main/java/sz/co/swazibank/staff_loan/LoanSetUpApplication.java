package sz.co.swazibank.staff_loan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LoanSetUpApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanSetUpApplication.class, args);
	}

}
