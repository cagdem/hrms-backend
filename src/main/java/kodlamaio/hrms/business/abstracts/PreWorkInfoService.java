package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.PreWorkInfo;

public interface PreWorkInfoService {
	DataResult<List<PreWorkInfo>> getAllSortedByDate(int employeeId);
}
