package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAd;

@RestController
@RequestMapping("/api/jobads")
public class JobAdController {

	private JobAdService jobAdService;

	@Autowired
	public JobAdController(JobAdService jobAdService) {
		super();
		this.jobAdService = jobAdService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobAd>> getAll(){
		return this.jobAdService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAd jobAd) {
		return this.jobAdService.add(jobAd);
	}
	
	@GetMapping("/getbycompanyid")
	public DataResult<List<JobAd>> getByCompanyId(@RequestParam int companyId) {
		return this.jobAdService.getByCompanyId(companyId);
	}

	@GetMapping("/getallsortedbydate")
	public DataResult<List<JobAd>> getAllSortedByDate() {
		return this.jobAdService.getAllSortedByDate();
	}


}
