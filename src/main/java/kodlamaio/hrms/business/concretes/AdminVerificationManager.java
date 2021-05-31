package kodlamaio.hrms.business.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utilities.verifications.abstracts.AdminVerificationService;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class AdminVerificationManager implements AdminVerificationService {

	@Override
	public Boolean isVerifiedByAdmin(Employer employer) {
		return true;
	}

}
