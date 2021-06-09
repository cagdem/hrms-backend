package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "university_infos")
@AllArgsConstructor
@NoArgsConstructor
public class UniversityInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
		
	@ManyToOne()
	@JoinColumn(name = "employee_id",referencedColumnName = "id")
	private Employee employee;
	
	@Column(name = "university_name")
	private String universityName;
	
	@Column(name = "university_department")
	private String univesityDepartment;
	
	@Column(name = "university_starting_year")
	private Date universityStartingYear;
	
	@Column(name = "university_ending_year")
	private Date universityEndingYear;

}
