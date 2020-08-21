package sz.co.swazibank.staff_loan.personalLoanFiles;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "personal_loan_setup")
public class PersonalLoanSetup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@NotNull
	@Column(name = "credit_analyst")
	private String creditAnalyst;
	
	@NotNull
	@Column(name = "credit_analyst_email")
	private String creditAnalystEmail;
	
	@NotNull
	@Column(name = "floating_rate")
	private float floatingrate;
	
	@NotNull
	@Column(name = "funeral_cover")
	private float funeralCover;

	@NotNull
	@Column(name = "loan_disbursement_supervisor")
	private String loanDisbursementSupervisor;

	@NotNull
	@Column(name = "loan_disbursement_supervisor_email")
	private String loanDisbursementSupervisorEmail;
	
	@NotNull
	@Column(name = "management_fee")
	private float managementFee;

	@NotNull
	@Column(name = "manager_credit")
	private String managerCredit;
	
	@NotNull
	@Column(name = "manager_credit_email")
	private String managerCreditEmail;
	
	@NotNull
	@Column(name = "prime_rate")
	private float primeRate;
	
	@NotNull
	@Column(name = "securities_supervisor")
	private String securitiesSupervisor;

	@NotNull
	@Column(name = "securities_supervisor_email")
	private String securitiesSupervisorEmail;
	
	@NotNull
	@Column(name = "standing_fee")
	private float standingFee;
	
	
	
	


	
	public static PersonalLoanSetupBuilder builder() {
		return new PersonalLoanSetupBuilder();
	}



	public PersonalLoanSetup(String creditAnalyst, String creditAnalystEmail, float floatingrate, float funeralCover,
			String loanDisbursementSupervisor, String loanDisbursementSupervisorEmail, float managementFee,
			String managerCredit, String managerCreditEmail, float primeRate, String securitiesSupervisor,
			String securitiesSupervisorEmail, float standingFee) {
		super();
		this.creditAnalyst = creditAnalyst;
		this.creditAnalystEmail = creditAnalystEmail;
		this.floatingrate = floatingrate;
		this.funeralCover = funeralCover;
		this.loanDisbursementSupervisor = loanDisbursementSupervisor;
		this.loanDisbursementSupervisorEmail = loanDisbursementSupervisorEmail;
		this.managementFee = managementFee;
		this.managerCredit = managerCredit;
		this.managerCreditEmail = managerCreditEmail;
		this.primeRate = primeRate;
		this.securitiesSupervisor = securitiesSupervisor;
		this.securitiesSupervisorEmail = securitiesSupervisorEmail;
		this.standingFee = standingFee;
	}



	public static class PersonalLoanSetupBuilder {
		 
		private String creditAnalyst;		
		private String creditAnalystEmail;		
		private float floatingrate;
		private float funeralCover;
		private String loanDisbursementSupervisor;
		private String loanDisbursementSupervisorEmail;
		private float managementFee;
		private String managerCredit;
		private String managerCreditEmail;
		private float primeRate;
		private String securitiesSupervisor;
		private String securitiesSupervisorEmail;		
		private float standingFee;
					
			
			public PersonalLoanSetupBuilder setFloatingrate(float floatingrate) {
				this.floatingrate = floatingrate;
				return this;
			}
			
			public PersonalLoanSetupBuilder setFuneralCover(float funeralCover) {
				this.funeralCover = funeralCover;
				return this;
			}
			
			public PersonalLoanSetupBuilder setManagementFee(float managementFee) {
				this.managementFee = managementFee;
				return this;
			}
			
			public PersonalLoanSetupBuilder setPrimeRate(float primeRate) {
				this.primeRate = primeRate;
				return this;
			}
			
			public PersonalLoanSetupBuilder setCreditAnalyst(String creditAnalyst) {
				this.creditAnalyst = creditAnalyst;
				return this;
			}
			
			public PersonalLoanSetupBuilder setCreditAnalystEmail(String creditAnalystEmail) {
				this.creditAnalystEmail = creditAnalystEmail;
				return this;
			}
			
			public PersonalLoanSetupBuilder setSecuritiesSupervisor(String securitiesSupervisor) {
				this.securitiesSupervisor = securitiesSupervisor;
				return this;
			}
			
			public PersonalLoanSetupBuilder setSecuritiesSupervisorEmail(String securitiesSupervisorEmail) {
				this.securitiesSupervisorEmail = securitiesSupervisorEmail;
				return this;
			}
			
			public PersonalLoanSetupBuilder setLoanDisbursementSupervisor(String loanDisbursementSupervisor) {
				this.loanDisbursementSupervisor = loanDisbursementSupervisor;
				return this;
			}
			
			public PersonalLoanSetupBuilder setLoanDisbursementSupervisorEmail(String loanDisbursementSupervisorEmail) {
				this.loanDisbursementSupervisorEmail = loanDisbursementSupervisorEmail;
				return this;
			}
			
			public PersonalLoanSetupBuilder setManagerCredit(String managerCredit) {
				this.managerCredit = managerCredit;
				return this;
			}
			
			public PersonalLoanSetupBuilder setManagerCreditEmail(String managerCreditEmail) {
				this.managerCreditEmail = managerCreditEmail;
				return this;
			}
			
			
			public PersonalLoanSetupBuilder setStandingFee(float standingFee) {
				this.standingFee = standingFee;
				return this;
			}

			public PersonalLoanSetup build() {
				return new PersonalLoanSetup(creditAnalyst,creditAnalystEmail,floatingrate,funeralCover,loanDisbursementSupervisor,loanDisbursementSupervisorEmail,managementFee,managerCredit,managerCreditEmail,primeRate,securitiesSupervisor,securitiesSupervisorEmail,standingFee);
			}
			
			
		 
	 }

}
