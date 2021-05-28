package com.sl.shopingCart.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriceDetailCommen extends CommenResponse{
	
	private ProductDetailResponse productDetailResponse;

	public PriceDetailCommen(String msg, int code) {
		super(msg, code);
		// TODO Auto-generated constructor stub
	}
	

}
