package sz.co.swazibank.staff_loan.personalLoanFiles;

import java.util.List;

public interface PersonalLoanSetupService {

	public List<PersonalLoanSetup> findAll();

	public PersonalLoanSetup findStaffLoanSetupById(int theId);

	public void savePersonalLoanSetup(PersonalLoanSetup thePersonalLoanSetup);
	
}
