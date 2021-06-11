package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.LinkInfo;

public interface LinkInfoDao extends JpaRepository<LinkInfo, Integer>{

}
