package com.mocadev.catalogservice.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.Date;
import lombok.Data;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-07-24
 **/
@Data
@JsonInclude(Include.NON_NULL)
public class ResponseCatalog {

	private String productId;
	private String productName;
	private Integer unitPrice;
	private Integer stock;
	private Date createdAt;

}
