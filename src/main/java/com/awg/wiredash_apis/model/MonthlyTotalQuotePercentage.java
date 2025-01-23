package com.awg.wiredash_apis.model;

import java.math.BigDecimal;

public interface MonthlyTotalQuotePercentage {
	String getId();
    String getCompany();
    int getStatusId();
    BigDecimal getTotalAmount();
    Integer getTotalQuantity();
    BigDecimal getPercentage();
    String getStatus();
    int getMonth();
    int getYear();
}
