package sz.co.swazibank.staff_loan.staffLoanfiles;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffLoanSetUpRepository extends JpaRepository<StaffLoanSetup, Integer>{
	
	StaffLoanSetup findStaffLoanSetupById(int id);

}
