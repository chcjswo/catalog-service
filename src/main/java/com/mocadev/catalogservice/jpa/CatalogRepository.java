package com.mocadev.catalogservice.jpa;

import org.springframework.data.repository.CrudRepository;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-07-24
 **/
public interface CatalogRepository extends CrudRepository<CatalogEntity, Long> {

	CatalogEntity findByProductId(String productId);

}
