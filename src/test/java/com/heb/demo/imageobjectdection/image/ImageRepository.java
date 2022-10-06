package com.heb.demo.imageobjectdection.image;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface ImageRepository extends Repository<Image, Integer> {

    /**
	 * Retrieve an {@link Image} from the data store by id.
	 * @param id the id to search for
	 * @return the {@link Image} if found.
	 */
	@Query("SELECT img FROM Image img WHERE img.id =:id")
	@Transactional(readOnly = true)
	Image getImageById(@Param("id") Long id);

    
    /**
	 * Save an {@link Image} to the data store, either inserting or updating it.
	 * @param image the {@link Image} to save
	 */
	void save(Image image);

	/**
	 * Returnes all the images from data store
	 **/
	@Query("SELECT image FROM Image image")
	@Transactional(readOnly = true)
	List<Image> findAll();
}
