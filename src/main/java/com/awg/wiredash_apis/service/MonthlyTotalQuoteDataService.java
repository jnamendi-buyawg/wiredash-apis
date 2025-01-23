package com.awg.wiredash_apis.service;

import java.util.List;

import com.awg.wiredash_apis.model.MonthlyTotalQuoteDataInterface;
import com.awg.wiredash_apis.model.MonthlyTotalQuotePercentage;

public interface MonthlyTotalQuoteDataService {
	List<MonthlyTotalQuoteDataInterface> getByCompanyAndMonthAndYear(String company, int year, int month);
	
	List<MonthlyTotalQuotePercentage> getPercentageByCompanyAndMonthAndYear2(String company, int year, int month);
}
