package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Resumee;

public interface ResumeeService {
	DataResult<List<Resumee>> getAll();
	DataResult<Resumee> getById(int employeeId);
	
	Result add(Resumee resumee);
}
