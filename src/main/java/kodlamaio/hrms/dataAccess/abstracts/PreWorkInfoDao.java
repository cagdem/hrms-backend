package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.PreWorkInfo;

public interface PreWorkInfoDao extends JpaRepository<PreWorkInfo, Integer>{
	List<PreWorkInfo> findByResumee_EmployeeIdOrderByPreWorkEndingYearAsc(int employeeId);
}
