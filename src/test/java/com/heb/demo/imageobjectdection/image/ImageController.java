package com.heb.demo.imageobjectdection.image;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author William Barfield
 */
@Controller
public class ImageController {

    private ImageRepository images;
    
	@GetMapping("/images")
	public List<Image> get() {
		return images.findAll();
	}

	@GetMapping("/images/{imageId}")
	public Image getImageById(@PathVariable("id") Long id) {
		return images.getImageById(id);
	}

        
}
