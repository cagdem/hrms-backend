package kodlamaio.hrms.business.concretes.test;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utilities.verifications.abstracts.EmailVerificationService;

@Service
public class FakeEmailManager implements EmailVerificationService {

	@Override
	public Boolean isEmailVerified(String email) {
		return true;
	}

}
