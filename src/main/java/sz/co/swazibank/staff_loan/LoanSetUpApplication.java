package sz.co.swazibank.staff_loan;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import sz.co.swazibank.staff_loan.personalLoanFiles.PersonalLoanSetup;
import sz.co.swazibank.staff_loan.personalLoanFiles.PersonalLoanSetupRepository;
import sz.co.swazibank.staff_loan.staffLoanfiles.StaffLoanSetUpRepository;
import sz.co.swazibank.staff_loan.staffLoanfiles.StaffLoanSetup;

@SpringBootApplication
@EnableEurekaClient
public class LoanSetUpApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanSetUpApplication.class, args);
	}
	
	@Bean
	public ApplicationRunner initializer(PersonalLoanSetupRepository repository) {
		
		
		
	    return args -> repository.save(
	    		
	    		PersonalLoanSetup.builder().setFloatingrate((float) 1.5)
	    		.setFuneralCover((float) 5000)
	    		.setManagementFee((float) 500)
	    		.setPrimeRate((float) 1.5)
	    		.setCreditAnalyst("Robert Kigobe")
	    		.setCreditAnalystEmail("robertk@swazibank.co.sz")
	    		.setSecuritiesSupervisor("Robert Kigobe")
	    		.setSecuritiesSupervisorEmail("robertk@swazibank.co.sz")
	    		.setLoanDisbursementSupervisor("Robert Kigobe")
	    		.setLoanDisbursementSupervisorEmail("robertk@swazibank.co.sz")
	    		.setManagerCredit("Robert Kigobe")
	    		.setManagerCreditEmail("robertk@swazibank.co.sz").setStandingFee((float) 300)
	    		.build()
	    	
	    );
	}
	
	@Bean
	public ApplicationRunner initializer2(StaffLoanSetUpRepository repository) {
		
	    return args -> repository.save(
	    		StaffLoanSetup.builder().setInterestRate((float) 6.5)
	    		.setFuneralCover((float) 5000)
	    		.setPayrollAdmin("Robert Kigobe")
	    		.setPayrollAdminEmail("robertk@swazibank.co.sz")
	    		.setSeniorHrManager("Robert Kigobe")
	    		.setSeniorHrManagerEmail("robertk@swazibank.co.sz")
	    		.setSecuritiesSupervisor("Robert Kigobe")
	    		.setSecuritiesSupervisorEmail("robertk@swazibank.co.sz")
	    		.setLoanOpeningSupervisor("Robert Kigobe")
	    		.setLoanOpeningSupervisorEmail("robertk@swazibank.co.sz").build()
	    	
	    );
	}
	
	

}
