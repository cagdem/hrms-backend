package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.core.utilities.verifications.abstracts.MernisService;
import kodlamaio.hrms.entities.concretes.Employee;

public class FakeMernisManager implements MernisService{

	@Override
	public Boolean checkIfEmployeeRealPerson(Employee employee) {
		return true;
	}

}
