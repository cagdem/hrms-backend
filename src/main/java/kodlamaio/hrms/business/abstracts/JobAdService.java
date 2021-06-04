package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAd;

public interface JobAdService {
	DataResult<List<JobAd>> getAll();
	DataResult<List<JobAd>> getAllSortedByDate();
	
	Result add(JobAd jobAd);
	
	DataResult<List<JobAd>> getByCompanyId(int companyId);
	
}
