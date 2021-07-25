package com.mocadev.catalogservice.service;

import com.mocadev.catalogservice.jpa.CatalogEntity;
import com.mocadev.catalogservice.jpa.CatalogRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-07-25
 **/
@Data
@Slf4j
@Service
@RequiredArgsConstructor
public class CatalogServiceImpl implements CatalogService {

	private final CatalogRepository catalogRepository;

	@Override
	public Iterable<CatalogEntity> getAllCatalogs() {
		return catalogRepository.findAll();
	}

}
