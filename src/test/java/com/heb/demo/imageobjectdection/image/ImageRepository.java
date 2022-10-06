package com.heb.demo.imageobjectdection.image;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface ImageRepository extends Repository<Image, Integer> {

    /**
	 * Retrieve all {@link Image}s from the data store.
	 * @return a Collection of {@link Image}s.
	 */
	@Query("SELECT img FROM Image img ORDER BY img.id")
	@Transactional(readOnly = true)
	List<Image> getImages();

    /**
	 * Retrieve {@link Image}s from the data store by object name(s)
	 * whose image object name has been identified
	 * @param objectNames Value to search for
	 * @return a Collection of matching {@link Image}s (or an empty Collection if none
	 * found)
	 */

	@Query("SELECT img FROM Image where object_name LIKE :objectName% ")
	@Transactional(readOnly = true)
	Page<Image> findByLastName(@Param("objectName") String lastName, Pageable pageable);
    
}
