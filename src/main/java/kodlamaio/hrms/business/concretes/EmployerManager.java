package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.core.utilities.verifications.abstracts.AdminVerificationService;
import kodlamaio.hrms.core.utilities.verifications.abstracts.EmailVerificationService;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;
	private EmailVerificationService emailVerificationService;
	private AdminVerificationService adminVerificationService;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao, EmailVerificationService emailVerificationService,
			AdminVerificationService adminVerificationService) {
		super();
		this.employerDao = employerDao;
		this.emailVerificationService = emailVerificationService;
		this.adminVerificationService = adminVerificationService;
	}

	@Override
	public Result add(Employer employer) {
		Result result = isEmployerVerified(employer);
		if (result.isSuccess()) {
			this.employerDao.save(employer);
		}
		return result;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		List<Employer> result = this.employerDao.findAll();
		return new SuccessDataResult<List<Employer>>(result,"Is verenler listelendi.");
	}	
	
	private Result isEmployerVerified(Employer employer) {
		if (!this.adminVerificationService.isVerifiedByAdmin(employer)) {
			return new ErrorResult("HRMS personeli onayi verilmemis.");
		} 
		if (!this.employerDao.findByUser_Email(employer.getUser().getEmail()).isEmpty()) {
			return new ErrorResult("Bu mail daha once kullanilmis.");
		}
		if (!this.emailVerificationService.isEmailVerified(employer.getUser().getEmail())) {
			return new ErrorResult("Email onaylamasi yapilmamis.");
		}
		return new SuccessResult("Is veren eklendi.");
	}



}
