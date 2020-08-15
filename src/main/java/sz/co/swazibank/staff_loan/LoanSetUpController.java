package sz.co.swazibank.staff_loan;

import java.io.IOException;
import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import sz.co.swazibank.staff_loan.personalLoanFiles.PersonalLoanSetup;
import sz.co.swazibank.staff_loan.personalLoanFiles.PersonalLoanSetupService;
import sz.co.swazibank.staff_loan.staffLoanfiles.StaffLoanSetup;
import sz.co.swazibank.staff_loan.staffLoanfiles.StaffLoanSetupService;



@Controller
@RequestMapping("/loanSetup")
public class LoanSetUpController {

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}


	@Autowired
	private StaffLoanSetupService staffLoanSetupService;
	
	@Autowired
	private PersonalLoanSetupService personalLoanSetupService;
	
	@GetMapping("/home")
	public String home(Model theModel, Principal principal, RedirectAttributes attr) {

		theModel.addAttribute("username", principal.getName().toUpperCase());
		

		return "loansetup/home";
	}


	@GetMapping("/staffLoanSetupEdit/{theId}")
	public String showFormForSetup(@PathVariable int theId, Principal principal,Model theModel) {

		StaffLoanSetup theStaffLoanSetup = staffLoanSetupService.findStaffLoanSetupById(theId);
		
		if(theStaffLoanSetup == null) {
			throw new RuntimeException("Staff Loan by Ref" + theId + " is not found");
		}
		theModel.addAttribute("username", principal.getName().toUpperCase());
		theModel.addAttribute("theStaffLoanSetup", theStaffLoanSetup);

		return "loansetup/staffLoan-setup-form";
	}
	

	@PostMapping("/saveSetup")
	public String saveStaffLoanSetup(@ModelAttribute("staffLoanSetup") StaffLoanSetup theStaffLoanSetup,Principal principal,
			RedirectAttributes atts) throws IOException {
		
		staffLoanSetupService.saveStaffLoanSetup(theStaffLoanSetup);
		return "redirect:/staffLoan/staffLoanStatus";

	}
	
	@GetMapping("/personalLoanFormSetup")
	public String showPersonalLoanFormForSetup(Principal principal, Model theModel) {

		PersonalLoanSetup thePersonalLoanSetup = new PersonalLoanSetup();

		theModel.addAttribute("username", principal.getName().toUpperCase());
		
		theModel.addAttribute("thePersonalLoanSetup", thePersonalLoanSetup);

		return "loansetup/personalLoan-setup-form";
	}
	
	@GetMapping("/personalLoanSetupEdit/{theId}")
	public String showPersonalLoanFormForSetupEdit(@PathVariable int theId, Principal principal,Model theModel) {

		theModel.addAttribute("username", principal.getName().toUpperCase());
		
		PersonalLoanSetup thePersonalLoanSetup = personalLoanSetupService.findStaffLoanSetupById(theId);
		
		if(thePersonalLoanSetup == null) {
			
			
			thePersonalLoanSetup.setCreditAnalyst("test");
			thePersonalLoanSetup.setCreditAnalystEmail("test@email.com");
			thePersonalLoanSetup.setFloatingrate((float) 1.5);
			thePersonalLoanSetup.setFuneralCover((float)2000);
			thePersonalLoanSetup.setLoanDisbursementSupervisor("test");
			thePersonalLoanSetup.setLoanDisbursementSupervisorEmail("test@email.com");
			thePersonalLoanSetup.setManagementFee((float)500);
			thePersonalLoanSetup.setManagerCredit("test");
			thePersonalLoanSetup.setManagerCreditEmail("test@email.com");
			thePersonalLoanSetup.setPrimeRate((float)10);
			thePersonalLoanSetup.setSecuritiesSupervisor("test");
			thePersonalLoanSetup.setSecuritiesSupervisorEmail("test@email.com");
			
			personalLoanSetupService.savePersonalLoanSetup(thePersonalLoanSetup);
			
		}

		theModel.addAttribute("thePersonalLoanSetup", thePersonalLoanSetup);

		return "loansetup/personalLoan-setup-form";
	}
	
	@PostMapping("/savePersonalLoanSetup")
	public String  savePersonalLoanSetup(@ModelAttribute("thePersonalLoanSetup") PersonalLoanSetup thePersonalLoanSetup,
			RedirectAttributes atts) throws IOException {
		
		personalLoanSetupService.savePersonalLoanSetup(thePersonalLoanSetup);
		
		return "redirect:/loanSetup/home";

	}


}
