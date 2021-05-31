package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.core.utilities.verifications.abstracts.EmailVerificationService;
import kodlamaio.hrms.core.utilities.verifications.abstracts.MernisService;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeDao;
import kodlamaio.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {

	private EmployeeDao employeeDao;
	private MernisService mernisService;
	private EmailVerificationService emailVerificationService;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao, MernisService mernisService, EmailVerificationService emailVerificationService) {
		super();
		this.employeeDao = employeeDao;
		this.mernisService = mernisService;
		this.emailVerificationService = emailVerificationService;
	}


	@Override
	public Result add(Employee employee) {
		Result result = isEmployeeVerified(employee);
		return result;

	}
	
	
	
	
	private Result isEmployeeVerified(Employee employee) {
		if (!mernisService.checkIfEmployeeRealPerson(employee)) {
			return new ErrorResult("Mernis dogrulamasi basarisiz.");
		} 
		if (!this.employeeDao.findByEmail(employee.getEmail()).isEmpty()) {
			return new ErrorResult("Bu mail daha once kullanilmis.");
		}
		if (!this.employeeDao.findByNatId(employee.getNatId()).isEmpty()) {
			return new ErrorResult("Bu TcNo daha once kullanilmis.");
		}
		if (!this.emailVerificationService.isEmailVerified(employee.getEmail())) {
			return new ErrorResult("Email onaylamasi yapilmamis.");
		}
		return new SuccessResult("Is arayan eklendi.");
	}

}
