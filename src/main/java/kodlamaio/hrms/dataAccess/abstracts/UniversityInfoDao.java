package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.UniversityInfo;

public interface UniversityInfoDao extends JpaRepository<UniversityInfo, Integer>{

	List<UniversityInfo> findByResumee_EmployeeIdOrderByUniversityEndingYearAsc(int employeeId);
}
