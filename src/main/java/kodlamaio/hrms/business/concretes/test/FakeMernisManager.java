package kodlamaio.hrms.business.concretes.test;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utilities.verifications.abstracts.MernisService;
import kodlamaio.hrms.entities.concretes.Employee;

@Service
public class FakeMernisManager implements MernisService{

	@Override
	public Boolean checkIfEmployeeRealPerson(Employee employee) {
		return true;
	}

}
