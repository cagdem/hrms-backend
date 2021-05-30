package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.core.utilities.verifications.abstracts.AdminVerificationService;
import kodlamaio.hrms.entities.concretes.Employer;

public class AdminVerificationManager implements AdminVerificationService {

	@Override
	public Boolean isVerifiedByAdmin(Employer employer) {
		return true;
	}

}
