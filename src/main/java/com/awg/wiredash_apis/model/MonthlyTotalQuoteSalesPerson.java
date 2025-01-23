package com.awg.wiredash_apis.model;

import java.math.BigDecimal;

public interface MonthlyTotalQuoteSalesPerson {
	String getId();
    String getCompany();
    String getSalesPersonName();
    BigDecimal getTotalAmount();
    Integer getTotalQuantity();
    int getMonth();
    int getYear();
}