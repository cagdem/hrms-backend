package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.ResumeeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Resumee;

@RestController
@RequestMapping("/api/resumees")
public class ResumeeController {

	private ResumeeService resumeeService;

	@Autowired
	public ResumeeController(ResumeeService resumeeService) {
		super();
		this.resumeeService = resumeeService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Resumee>> getAll(){
		return this.resumeeService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Resumee resumee) {
		return this.resumeeService.add(resumee);
	}
}
