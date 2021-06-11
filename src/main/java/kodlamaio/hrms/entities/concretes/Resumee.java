package kodlamaio.hrms.entities.concretes;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="resumees")
@AllArgsConstructor
@NoArgsConstructor
public class Resumee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "id")
	private int id;
	
	@OneToOne()
	@JoinColumn(name= "employee_id")
	private Employee employee;
	
	@OneToMany(mappedBy = "resumee")
	private List<UniversityInfo> universityInfo;
	
	@OneToMany(mappedBy = "resumee")
	private List<PreWorkInfo> preWorkInfo;
	
	@OneToMany(mappedBy = "resumee")
	private List<LanguageInfo> languageInfo;
	
	@OneToOne()
	@JoinColumn(name = "linkinfo_id",referencedColumnName = "id")
	private LinkInfo linkInfo;
	
	@OneToMany(mappedBy = "resumee")
	private List<ProgrammingLangInfo> programmingLangInfo;
	
	@OneToOne()
	@JoinColumn(name = "jobletterinfo_id",referencedColumnName = "id")
	private JobLetterInfo jobLetterInfo;

}
