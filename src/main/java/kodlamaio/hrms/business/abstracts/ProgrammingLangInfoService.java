package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.ProgrammingLangInfo;

public interface ProgrammingLangInfoService {
	DataResult<List<ProgrammingLangInfo>> getAllByEmployeeId(int employeeId);
	Result add(ProgrammingLangInfo programmingLangInfo);
}
