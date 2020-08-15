package sz.co.swazibank.staff_loan;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sz.co.swazibank.staff_loan.personalLoanFiles.PersonalLoanSetup;
import sz.co.swazibank.staff_loan.personalLoanFiles.PersonalLoanSetupService;
import sz.co.swazibank.staff_loan.staffLoanfiles.StaffLoanSetup;
import sz.co.swazibank.staff_loan.staffLoanfiles.StaffLoanSetupService;

@RestController
@RequestMapping("/setuprest")
public class LoanSetUpRestcontroller {

	@Autowired
	PersonalLoanSetupService personalLoanSetupService;
	
	@Autowired
	StaffLoanSetupService staffLoanSetupService;

	@GetMapping("/personalLoanSetup/{theId}")
	public PersonalLoanSetup showPersonalLoanFormForSetupEdit(@PathVariable int theId) {

		PersonalLoanSetup thePersonalLoanSetup = personalLoanSetupService.findStaffLoanSetupById(theId);

		return thePersonalLoanSetup;
	}
	
	@GetMapping("/staffLoanSetup/{theId}")
	public StaffLoanSetup showFormForSetup(@PathVariable int theId, Principal principal,Model theModel) {

		StaffLoanSetup theStaffLoanSetup = staffLoanSetupService.findStaffLoanSetupById(theId);
		
		return theStaffLoanSetup;
	}
}
