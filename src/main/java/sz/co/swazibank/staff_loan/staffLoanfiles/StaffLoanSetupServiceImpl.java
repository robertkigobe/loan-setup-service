package sz.co.swazibank.staff_loan.staffLoanfiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffLoanSetupServiceImpl implements StaffLoanSetupService{
	
	@Autowired
	StaffLoanSetUpRepository staffLoanSetupRepository;

	@Override
	public void saveStaffLoanSetup(StaffLoanSetup theStaffLoanSetup) {
		
		staffLoanSetupRepository.save(theStaffLoanSetup);
	}

	@Override
	public StaffLoanSetup findStaffLoanSetupById(int theId) {
		
		return staffLoanSetupRepository.findStaffLoanSetupById(theId);
	}

}
