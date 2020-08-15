package sz.co.swazibank.staff_loan.staffLoanfiles;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
@Transactional
public interface StaffLoanSetupService {

	public void saveStaffLoanSetup(StaffLoanSetup theStaffLoanSetup);
	
	public StaffLoanSetup findStaffLoanSetupById(int theId);
	

}
