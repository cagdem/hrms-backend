package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "link_infos")
public class LinkInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@OneToOne()
	@JoinColumn(name = "employee_id",referencedColumnName = "id")
	private Employee employee;
	
	@Column(name = "photo_link")
	private String photoLink;
	
	@Column(name = "githuburl")
	private String githubURL;
	
	@Column(name= "linkedinurl")
	private String linkedinURL;
}
