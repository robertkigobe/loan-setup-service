package sz.co.swazibank.staff_loan.personalLoanFiles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalLoanSetupRepository extends JpaRepository<PersonalLoanSetup, Integer>{
	
	@Query(value = "Select * from personal_loan_setup p where p.id =:theId", nativeQuery=true)
	PersonalLoanSetup findStaffLoanSetupById(@Param("theId") int theId);

}
