package com.awg.wiredash_apis.service;

import java.util.List;

import com.awg.wiredash_apis.model.MonthlyTotalQuotePercentage;
import com.awg.wiredash_apis.model.MonthlyTotalQuoteProductCategory;
import com.awg.wiredash_apis.model.MonthlyTotalQuoteSalesPerson;
import com.awg.wiredash_apis.domain.MonthlyTotalQuoteData;
import com.awg.wiredash_apis.model.MonthlyTotalQuoteCustomerGroup;

public interface MonthlyTotalQuoteDataService {
	List<MonthlyTotalQuoteData> getByCompanyAndMonthAndYear(String company, Integer year, Integer month);
	
	List<MonthlyTotalQuotePercentage> getPercentageByCompanyAndMonthAndYear2(String company, Integer year, Integer month);
	
	List<MonthlyTotalQuoteSalesPerson> getTotalSalesPersonCompanyAndMonthAndYear4(String company,Integer year,Integer month);
	
	List<MonthlyTotalQuoteProductCategory> getTotalProductCategoryCompanyAndMonthAndYear5(String company,int year,int month);
	
	List<MonthlyTotalQuoteCustomerGroup> getTotalCustomerGroupCompanyAndMonthAndYear6(String company,int year,int month);
}
