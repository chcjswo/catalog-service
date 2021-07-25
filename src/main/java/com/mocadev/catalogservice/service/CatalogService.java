package com.mocadev.catalogservice.service;

import com.mocadev.catalogservice.jpa.CatalogEntity;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-07-25
 **/
public interface CatalogService {

	Iterable<CatalogEntity> getAllCatalogs();

}
