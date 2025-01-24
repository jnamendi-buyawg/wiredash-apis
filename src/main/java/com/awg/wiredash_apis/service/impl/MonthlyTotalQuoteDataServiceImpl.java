package com.awg.wiredash_apis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awg.wiredash_apis.model.MonthlyTotalQuoteDataInterface;
import com.awg.wiredash_apis.model.MonthlyTotalQuotePercentage;
import com.awg.wiredash_apis.model.MonthlyTotalQuoteProductCategory;
import com.awg.wiredash_apis.model.MonthlyTotalQuoteSalesPerson;
import com.awg.wiredash_apis.repository.MonthlyTotalQuoteDataRepository;
import com.awg.wiredash_apis.service.MonthlyTotalQuoteDataService;

@Service
public class MonthlyTotalQuoteDataServiceImpl implements MonthlyTotalQuoteDataService{
    @Autowired
    private MonthlyTotalQuoteDataRepository repository;
    
	@Override
	public List<MonthlyTotalQuoteDataInterface> getByCompanyAndMonthAndYear(String company, int year, int month){
		return repository.getByCompanyAndMonthAndYear(company, year, month);
	}

	@Override
	public List<MonthlyTotalQuotePercentage> getPercentageByCompanyAndMonthAndYear2(String company, int year, int month){
		return repository.getPercentageByCompanyAndMonthAndYear2(company, year, month);
	}
	
	@Override
	public List<MonthlyTotalQuotePercentage> getPercentageByCompanyAndYear3(String company, int year){
		return repository.getPercentageByCompanyAndYear3(company, year);
	}
	
	@Override
	public List<MonthlyTotalQuoteSalesPerson> getTotalSalesPersonCompanyAndMonthAndYear4(String company,int year,int month){
		return repository.getTotalSalesPersonCompanyAndMonthAndYear4(company, year, month);
	}
	
	@Override
	public List<MonthlyTotalQuoteProductCategory> getTotalProductCategoryCompanyAndMonthAndYear5(String company,int year,int month){
		return repository.getTotalProductCategoryCompanyAndMonthAndYear5(company, year, month);
	}
}
