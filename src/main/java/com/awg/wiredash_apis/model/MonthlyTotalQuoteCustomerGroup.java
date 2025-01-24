package com.awg.wiredash_apis.model;

import java.math.BigDecimal;

public interface MonthlyTotalQuoteCustomerGroup {
	String getId();
    String getCompany();
    String getCustomerGroup();
    BigDecimal getTotalAmount();
    Integer getTotalQuantity();
    int getMonth();
    int getYear(); 
}
