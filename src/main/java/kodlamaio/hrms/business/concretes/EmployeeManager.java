package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.core.dataAccess.UserDao;
import kodlamaio.hrms.core.entities.User;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.core.utilities.verifications.abstracts.EmailVerificationService;
import kodlamaio.hrms.core.utilities.verifications.abstracts.MernisService;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeDao;
import kodlamaio.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {

	private UserDao userDao;
	private EmployeeDao employeeDao;
	private MernisService mernisService;
	private EmailVerificationService emailVerificationService;
	
	@Autowired
	public EmployeeManager(UserDao userDao, EmployeeDao employeeDao, MernisService mernisService, EmailVerificationService emailVerificationService) {
		super();
		this.employeeDao = employeeDao;
		this.mernisService = mernisService;
		this.emailVerificationService = emailVerificationService;
		this.userDao = userDao;
	}


	@Override
	public Result add(Employee employee) {
		Result result = isEmployeeVerified(employee);
		if (result.isSuccess()) {
			this.userDao.save(employee.getUser());
			User user = this.userDao.findByEmail(employee.getUser().getEmail());
			employee.setUser(user);
			this.employeeDao.save(employee);
		}
		return result;

	}
	
	@Override
	public DataResult<List<Employee>> getAll() {
		List<Employee> result =this.employeeDao.findAll();
		return new SuccessDataResult<List<Employee>>(result,"Is arayanlar listelendi.");
	}	
	
	
	
	private Result isEmployeeVerified(Employee employee) {
		if (!mernisService.checkIfEmployeeRealPerson(employee)) {
			return new ErrorResult("Mernis dogrulamasi basarisiz.");
		} 
		if (!this.employeeDao.findByUser_Email(employee.getUser().getEmail()).isEmpty()) {
			return new ErrorResult("Bu mail daha once kullanilmis.");
		}
		if (!this.employeeDao.findByNatId(employee.getNatId()).isEmpty()) {
			return new ErrorResult("Bu TcNo daha once kullanilmis.");
		}
		if (!this.emailVerificationService.isEmailVerified(employee.getUser().getEmail())) {
			return new ErrorResult("Email onaylamasi yapilmamis.");
		}
		return new SuccessResult("Is arayan eklendi.");
	}




}
