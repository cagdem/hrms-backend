package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobLetterInfo;

public interface JobLetterInfoDao extends JpaRepository<JobLetterInfo, Integer> {

}
