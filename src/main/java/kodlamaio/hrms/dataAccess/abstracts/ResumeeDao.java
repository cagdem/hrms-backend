package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Resumee;

public interface ResumeeDao extends JpaRepository<Resumee, Integer>{
	Resumee findByEmployee_Id(int employeeId);
}
