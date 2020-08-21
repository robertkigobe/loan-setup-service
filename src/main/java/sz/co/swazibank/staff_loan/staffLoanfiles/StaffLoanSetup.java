package sz.co.swazibank.staff_loan.staffLoanfiles;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sz.co.swazibank.staff_loan.personalLoanFiles.PersonalLoanSetup.PersonalLoanSetupBuilder;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "staff_loan_setup")
public class StaffLoanSetup {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "payroll_admin")
	String payrollAdmin;
	
	@Column(name = "payroll_admin_email")
	String payrollAdminEmail;
	
	@Column(name = "senior_hr_manager")
	String seniorHrManager;
	
	@Column(name = "senior_hr_manager_email")
	String seniorHrManagerEmail;
	
	@Column(name = "securities_supervisor")
	String securitiesSupervisor;
	
	@Column(name = "securities_supervisor_email")
	String securitiesSupervisorEmail;
	
	@Column(name = "loan_opening_supervisor")
	String loanOpeningSupervisor;
	
	@Column(name = "loan_opening_supervisor_email")
	String loanOpeningSupervisorEmail;
	
	@Column(name = "interest_rate")
	private float interestRate;
	
	@Column(name = "funeral_cover")
	private float funeralCover;

	public StaffLoanSetup(String payrollAdmin, String payrollAdminEmail, String seniorHrManager,
			String seniorHrManagerEmail, String securitiesSupervisor, String securitiesSupervisorEmail,
			String loanOpeningSupervisor, String loanOpeningSupervisorEmail, float interestRate, float funeralCover) {
		super();
		this.payrollAdmin = payrollAdmin;
		this.payrollAdminEmail = payrollAdminEmail;
		this.seniorHrManager = seniorHrManager;
		this.seniorHrManagerEmail = seniorHrManagerEmail;
		this.securitiesSupervisor = securitiesSupervisor;
		this.securitiesSupervisorEmail = securitiesSupervisorEmail;
		this.loanOpeningSupervisor = loanOpeningSupervisor;
		this.loanOpeningSupervisorEmail = loanOpeningSupervisorEmail;
		this.interestRate = interestRate;
		this.funeralCover = funeralCover;
	}
	
	public static StaffLoanSetupBuilder builder() {
		// TODO Auto-generated method stub
		return new StaffLoanSetupBuilder();
	}
	
	public static class StaffLoanSetupBuilder{
		
		String payrollAdmin;		
		String payrollAdminEmail;		
		String seniorHrManager;		
		String seniorHrManagerEmail;		
		String securitiesSupervisor;		
		String securitiesSupervisorEmail;		
		String loanOpeningSupervisor;		
		String loanOpeningSupervisorEmail;		
		private float interestRate;		
		private float funeralCover;
		
		public StaffLoanSetupBuilder setPayrollAdmin(String payrollAdmin) {
			this.payrollAdmin = payrollAdmin;
			return this;
		}
		public StaffLoanSetupBuilder setPayrollAdminEmail(String payrollAdminEmail) {
			this.payrollAdminEmail = payrollAdminEmail;
			return this;
		}
		public StaffLoanSetupBuilder setSeniorHrManager(String seniorHrManager) {
			this.seniorHrManager = seniorHrManager;
			return this;
		}
		public StaffLoanSetupBuilder setSeniorHrManagerEmail(String seniorHrManagerEmail) {
			this.seniorHrManagerEmail = seniorHrManagerEmail;
			return this;
		}
		public StaffLoanSetupBuilder setSecuritiesSupervisor(String securitiesSupervisor) {
			this.securitiesSupervisor = securitiesSupervisor;
			return this;
		}
		public StaffLoanSetupBuilder setSecuritiesSupervisorEmail(String securitiesSupervisorEmail) {
			this.securitiesSupervisorEmail = securitiesSupervisorEmail;
			return this;
		}
		public StaffLoanSetupBuilder setLoanOpeningSupervisor(String loanOpeningSupervisor) {
			this.loanOpeningSupervisor = loanOpeningSupervisor;
			return this;
		}
		public StaffLoanSetupBuilder setLoanOpeningSupervisorEmail(String loanOpeningSupervisorEmail) {
			this.loanOpeningSupervisorEmail = loanOpeningSupervisorEmail;
			return this;
		}
		public StaffLoanSetupBuilder setInterestRate(float interestRate) {
			this.interestRate = interestRate;
			return this;
		}
		public StaffLoanSetupBuilder setFuneralCover(float funeralCover) {
			this.funeralCover = funeralCover;
			return this;
		}
		
		public StaffLoanSetup build() {
			
			return new StaffLoanSetup(payrollAdmin,payrollAdminEmail,seniorHrManager,seniorHrManagerEmail,securitiesSupervisor,securitiesSupervisorEmail,loanOpeningSupervisor,loanOpeningSupervisorEmail,interestRate,funeralCover);
		}
		
	}

}
