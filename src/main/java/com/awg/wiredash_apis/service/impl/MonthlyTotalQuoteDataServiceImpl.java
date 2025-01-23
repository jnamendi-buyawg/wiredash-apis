package com.awg.wiredash_apis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awg.wiredash_apis.model.MonthlyTotalQuoteDataInterface;
import com.awg.wiredash_apis.model.MonthlyTotalQuotePercentage;
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
}
