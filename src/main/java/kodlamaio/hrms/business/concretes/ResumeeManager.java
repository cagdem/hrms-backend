package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ResumeeService;
import kodlamaio.hrms.core.entities.User;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ResumeeDao;
import kodlamaio.hrms.entities.concretes.Resumee;

@Service
public class ResumeeManager implements ResumeeService{

	private ResumeeDao resumeeDao;
	
	@Autowired
	public ResumeeManager(ResumeeDao resumeeDao) {
		super();
		this.resumeeDao = resumeeDao;
	}

	@Override
	public DataResult<List<Resumee>> getAll() {
		return new SuccessDataResult<List<Resumee>>(this.resumeeDao.findAll(), "Butun Cvler listelendi.");
	}

	@Override
	public Result add(Resumee resumee) {

		this.resumeeDao.save(resumee);
		return new SuccessResult("Cv eklendi.");
	}

	@Override
	public DataResult<Resumee> getById(int employeeId) {
		return new SuccessDataResult<Resumee>(this.resumeeDao.findByEmployee_Id(employeeId),"Kisinin Cvsi getirildi.");
	}

}
