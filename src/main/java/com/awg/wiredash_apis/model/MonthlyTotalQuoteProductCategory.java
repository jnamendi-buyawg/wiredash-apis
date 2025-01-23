package com.awg.wiredash_apis.model;

import java.math.BigDecimal;

public interface MonthlyTotalQuoteProductCategory {
		String getId();
	    String getCompany();
	    String getProductCategory();
	    BigDecimal getTotalAmount();
	    Integer getTotalQuantity();
	    int getMonth();
	    int getYear(); 
}
