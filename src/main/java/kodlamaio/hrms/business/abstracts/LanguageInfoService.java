package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.LanguageInfo;

public interface LanguageInfoService {
	DataResult<List<LanguageInfo>> getAllByEmployeeId(int employeeId);
	Result add(LanguageInfo languageInfo);
}
