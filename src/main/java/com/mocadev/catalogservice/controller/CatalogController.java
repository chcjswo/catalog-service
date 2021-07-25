package com.mocadev.catalogservice.controller;

import com.mocadev.catalogservice.jpa.CatalogEntity;
import com.mocadev.catalogservice.service.CatalogService;
import com.mocadev.catalogservice.vo.ResponseCatalog;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-07-25
 **/
@RestController
@RequestMapping("/catalog-service")
@RequiredArgsConstructor
public class CatalogController {

	private final Environment env;
	private final CatalogService catalogService;

	@GetMapping("/health-check")
	public String status() {
		return String.format("It's Working in Catalog Service on PORT %s", env.getProperty("local.server.port"));
	}

	@GetMapping("/users")
	public ResponseEntity<List<ResponseCatalog>> getCatalogs() {
		Iterable<CatalogEntity> catalogs = catalogService.getAllCatalogs();
		List<ResponseCatalog> result = new ArrayList<>();
		ModelMapper mapper = new ModelMapper();

		catalogs.forEach(v -> {
			result.add(mapper.map(v, ResponseCatalog.class));
		});

		return ResponseEntity.status(HttpStatus.OK).body(result);
	}

}
