package kodlamaio.hrms.core.business;

import kodlamaio.hrms.core.utilities.results.DataResult;
import org.springframework.web.multipart.MultipartFile;

public interface CloudinaryService {
    DataResult<?> uploadPhoto(MultipartFile file);
}
