package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.PreWorkInfo;

public interface PreWorkInfoDao extends JpaRepository<PreWorkInfo, Integer>{

}
