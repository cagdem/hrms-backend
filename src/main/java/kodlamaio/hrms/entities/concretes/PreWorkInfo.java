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
@Table(name = "prework_infos")
@AllArgsConstructor
@NoArgsConstructor
public class PreWorkInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
		
	@ManyToOne()
	@JoinColumn(name = "employee_id",referencedColumnName = "id")
	private Employee employee;
	
	@Column(name = "prework_name")
	private String preWorkName;
	
	@Column(name = "prework_position")
	private String prePosition;
	
	@Column(name = "prework_starting_year")
	private Date preWorkStartingYear;
	
	@Column(name = "prework_ending_year")
	private Date preWorkEndingYear;

}
