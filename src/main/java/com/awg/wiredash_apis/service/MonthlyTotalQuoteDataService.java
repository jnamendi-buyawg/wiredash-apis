package com.awg.wiredash_apis.service;

import java.util.List;

import com.awg.wiredash_apis.model.MonthlyTotalQuoteDataInterface;
import com.awg.wiredash_apis.model.MonthlyTotalQuotePercentage;
import com.awg.wiredash_apis.model.MonthlyTotalQuoteProductCategory;
import com.awg.wiredash_apis.model.MonthlyTotalQuoteSalesPerson;
import com.awg.wiredash_apis.model.MonthlyTotalQuoteCustomerGroup;

public interface MonthlyTotalQuoteDataService {
	List<MonthlyTotalQuoteDataInterface> getByCompanyAndMonthAndYear(String company, int year, int month);
	
	List<MonthlyTotalQuotePercentage> getPercentageByCompanyAndMonthAndYear2(String company, int year, int month);
	
	List<MonthlyTotalQuotePercentage> getPercentageByCompanyAndYear3(String company, int year);
	
	List<MonthlyTotalQuoteSalesPerson> getTotalSalesPersonCompanyAndMonthAndYear4(String company,int year,int month);
	
	List<MonthlyTotalQuoteProductCategory> getTotalProductCategoryCompanyAndMonthAndYear5(String company,int year,int month);
	
	List<MonthlyTotalQuoteCustomerGroup> getTotalCustomerGroupCompanyAndMonthAndYear6(String company,int year,int month);
}
