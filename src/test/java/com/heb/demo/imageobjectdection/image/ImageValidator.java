package com.heb.demo.imageobjectdection.image;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ImageValidator  implements Validator {

    // max image size in Mgb
    private static final Long IMAGE_SIZE_LIMIT = 100l;

    /**
	 * This Validator validates *just* Image instances
	 */
	@Override
	public boolean supports(Class<?> clazz) {
		return Image.class.isAssignableFrom(clazz);
	}
    @Override
    public void validate(Object obj, Errors errors) {
        Image img = (Image) obj;
        Long size = img.getSize();
        if (size > IMAGE_SIZE_LIMIT) {
            String msg = String.format("Image size (%d) larger than maximum allowed (%d) size.", IMAGE_SIZE_LIMIT);
            errors.rejectValue("size", msg);
        }
        
    }
    
}
