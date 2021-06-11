package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.LanguageInfo;

public interface LanguageInfoDao extends JpaRepository<LanguageInfo, Integer>{

}
