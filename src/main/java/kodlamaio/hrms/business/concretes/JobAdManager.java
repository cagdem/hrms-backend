package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdDao;
import kodlamaio.hrms.entities.concretes.JobAd;

@Service
public class JobAdManager implements JobAdService {

	private JobAdDao jobAdDao;
	
	@Autowired
	public JobAdManager(JobAdDao jobAdDao) {
		super();
		this.jobAdDao = jobAdDao;
	}

	@Override
	public DataResult<List<JobAd>> getAll() {
		return new SuccessDataResult<List<JobAd>>(this.jobAdDao.findAll(),"Ilanlar listelendi.");
	}

	@Override
	public DataResult<List<JobAd>> getAllSortedByDate() {
		Sort sort= Sort.by(Sort.Direction.DESC,"endingDate");
		return new SuccessDataResult<List<JobAd>>(this.jobAdDao.findAll(sort),"Basarili.");
	}

	@Override
	public DataResult<List<JobAd>> getByCompanyId(int companyId) {
		return new SuccessDataResult<List<JobAd>>(this.jobAdDao.getByCompanyId(companyId));
	}

	@Override
	public Result add(JobAd jobAd) {
		this.jobAdDao.save(jobAd);
		return new SuccessResult("Ilan eklendi.");
	}

}
