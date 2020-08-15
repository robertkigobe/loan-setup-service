package sz.co.swazibank.staff_loan.personalLoanFiles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalLoanSetupServiceImpl implements PersonalLoanSetupService {

	@Autowired
	PersonalLoanSetupRepository personalLoanSetupRepository;

	@Override
	public List<PersonalLoanSetup> findAll() {

		return personalLoanSetupRepository.findAll();
	}

	@Override
	public PersonalLoanSetup findStaffLoanSetupById(int theId) {
		return personalLoanSetupRepository.findStaffLoanSetupById(theId);
	}

	@Override
	public void savePersonalLoanSetup(PersonalLoanSetup thePersonalLoanSetup) {
		personalLoanSetupRepository.saveAndFlush(thePersonalLoanSetup);

	}

}
