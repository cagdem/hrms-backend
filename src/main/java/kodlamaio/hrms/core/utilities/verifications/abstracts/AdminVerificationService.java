package kodlamaio.hrms.core.utilities.verifications.abstracts;

import kodlamaio.hrms.entities.concretes.Employer;

public interface AdminVerificationService {
	Boolean isVerifiedByAdmin(Employer employer);
}
