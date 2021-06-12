package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.ProgrammingLangInfo;

public interface ProgrammingLangInfoDao extends JpaRepository<ProgrammingLangInfo, Integer> {

}
