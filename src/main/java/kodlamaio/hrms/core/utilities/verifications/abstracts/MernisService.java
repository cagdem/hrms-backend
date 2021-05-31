package kodlamaio.hrms.core.utilities.verifications.abstracts;

import kodlamaio.hrms.entities.concretes.Employee;

public interface MernisService {
	Boolean checkIfEmployeeRealPerson(Employee employee);
}
