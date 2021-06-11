package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.UniversityInfo;

public interface UniversityInfoDao extends JpaRepository<UniversityInfo, Integer>{

}
