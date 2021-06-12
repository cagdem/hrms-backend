package kodlamaio.hrms.core.business;

import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;

@Service
public class CloudinaryServiceAdapter implements CloudinaryService {

    @Override
    public DataResult<?> uploadPhoto(MultipartFile file) {
        Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "x",
                "api_key", "x",
                "api_secret", "x"));

        try{
            Map cloudinaryUploader = cloudinary.uploader()
                    .upload(file.getBytes()
                            ,ObjectUtils.emptyMap());
            return new SuccessDataResult<Map>(cloudinaryUploader);
        }

        catch (IOException e){
            e.printStackTrace();
        }
        return new ErrorDataResult<Map>();
    }
}
