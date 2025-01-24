package com.awg.wiredash_apis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awg.wiredash_apis.domain.MonthlyTotalQuoteData;
import com.awg.wiredash_apis.model.MonthlyTotalQuoteCustomerGroup;
import com.awg.wiredash_apis.model.MonthlyTotalQuotePercentage;
import com.awg.wiredash_apis.model.MonthlyTotalQuoteProductCategory;
import com.awg.wiredash_apis.model.MonthlyTotalQuoteSalesPerson;
import com.awg.wiredash_apis.repository.MonthlyTotalQuoteDataRepository;
import com.awg.wiredash_apis.service.MonthlyTotalQuoteDataService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class MonthlyTotalQuoteDataServiceImpl implements MonthlyTotalQuoteDataService{	
    @Autowired
    private MonthlyTotalQuoteDataRepository repository;
    @PersistenceContext
    private EntityManager entityManager;
    
    public static final String QUERY_1 = "SELECT * FROM [dbo].vwawg_monthly_total_quote_data WHERE 1=1";
    public static final String QUERY_2_3 = "SELECT * FROM [dbo].vwawg_monthly_total_quote_percentage_by_status WHERE 1=1";
    public static final String QUERY_4 = "SELECT * FROM [dbo].vwawg_total_quote_by_sales_person WHERE 1=1";
    
	@Override
	public List<MonthlyTotalQuoteData> getByCompanyAndMonthAndYear(String company, Integer year, Integer month){
		StringBuilder sb = addFilters(QUERY_1, company, year, month);
		return repository.getTotalData(entityManager, sb.toString());
	}

	@Override
	public List<MonthlyTotalQuotePercentage> getPercentageByCompanyAndMonthAndYear2(String company, Integer year, Integer month){
		StringBuilder sb = addFilters(QUERY_2_3, company, year, month);
		return repository.getPercentageByCompanyAndMonthAndYear2(entityManager, sb.toString());
	}
	
	
	@Override
	public List<MonthlyTotalQuoteSalesPerson> getTotalSalesPersonCompanyAndMonthAndYear4(String company,Integer year,Integer month){		
		StringBuilder sb = addFilters(QUERY_4, company, year, month);
		sb.append(" order by total_amount desc");
		return repository.getTotalSalesPersonCompanyAndMonthAndYear4(entityManager, sb.toString());
	}
	
	@Override
	public List<MonthlyTotalQuoteProductCategory> getTotalProductCategoryCompanyAndMonthAndYear5(String company,int year,int month){
		return repository.getTotalProductCategoryCompanyAndMonthAndYear5(company, year, month);
	}
	
	@Override
	public List<MonthlyTotalQuoteCustomerGroup> getTotalCustomerGroupCompanyAndMonthAndYear6(String company,int year,int month){
		return repository.getTotalCustomerGroupCompanyAndMonthAndYear6(company, year, month);
	}
	
	private StringBuilder addFilters(String query, String company,Integer year,Integer month) {
		StringBuilder sb = new StringBuilder(query);
		if(company != null && !company.isEmpty())
			sb.append(" AND company = '").append(company).append("'");
		if(year != null && year.intValue() > 0)
			sb.append(" AND year = ").append(year.toString());
		if(month != null && month.intValue() > 0)
			sb.append(" AND month = ").append(month.toString());
		return sb;
	}
}
