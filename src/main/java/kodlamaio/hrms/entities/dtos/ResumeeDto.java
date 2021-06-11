package kodlamaio.hrms.entities.dtos;

import java.util.List;

import kodlamaio.hrms.entities.concretes.JobLetterInfo;
import kodlamaio.hrms.entities.concretes.LanguageInfo;
import kodlamaio.hrms.entities.concretes.LinkInfo;
import kodlamaio.hrms.entities.concretes.PreWorkInfo;
import kodlamaio.hrms.entities.concretes.ProgrammingLangInfo;
import kodlamaio.hrms.entities.concretes.UniversityInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResumeeDto {

	private int id;
	private JobLetterInfo jobLetterInfo;
	private List<LanguageInfo> languageInfos;
	private LinkInfo linkInfo;
	private List<PreWorkInfo> preWorkInfos;
	private List<ProgrammingLangInfo> programmingLangInfos;
	private List<UniversityInfo> universityInfos;
}
