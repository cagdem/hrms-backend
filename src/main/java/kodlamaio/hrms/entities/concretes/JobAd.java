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
@Table(name="job_ads")
@AllArgsConstructor
@NoArgsConstructor
public class JobAd {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	//@Column(name = "position_name")
	//private String positionName;
	
	@Column(name = "company_id")
	private String companyId;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "min_salary")
	private int minSalary;
	
	@Column(name = "max_salary")
	private int maxSalary;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "ending_date")
	private Date endingDate;
	
	@Column(name = "starting_date")
	private Date startingDate;
	
	@Column(name = "status")
	private boolean status;
	
	@ManyToOne()
	@JoinColumn(name="position_name")
	private JobPosition jobPosition;
	
	
}
