package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.core.utilities.verifications.abstracts.EmailVerificationService;

public class FakeEmailManager implements EmailVerificationService {

	@Override
	public Boolean isEmailVerified(String email) {
		return true;
	}

}
