package com.awg.wiredash_apis.model;

import java.math.BigDecimal;

public interface MonthlyTotalQuoteDataInterface {   
	String getId();
    String getCompany();
    BigDecimal getTotalAmount();
    Integer getTotalQuantity();
    BigDecimal getConfirmedAmount();
    Integer getConfirmedQuantity();
    int getMonth();
    int getYear();
}
