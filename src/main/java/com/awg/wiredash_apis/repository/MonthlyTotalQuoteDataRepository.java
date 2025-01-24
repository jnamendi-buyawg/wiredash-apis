package com.awg.wiredash_apis.repository;


import com.awg.wiredash_apis.domain.MonthlyTotalQuoteData;
import com.awg.wiredash_apis.model.MonthlyTotalQuoteCustomerGroup;
import com.awg.wiredash_apis.model.MonthlyTotalQuoteDataInterface;
import com.awg.wiredash_apis.model.MonthlyTotalQuotePercentage;
import com.awg.wiredash_apis.model.MonthlyTotalQuoteProductCategory;
import com.awg.wiredash_apis.model.MonthlyTotalQuoteSalesPerson;

import jakarta.persistence.EntityManager;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthlyTotalQuoteDataRepository extends JpaRepository<MonthlyTotalQuoteData, String>{
	List<MonthlyTotalQuoteData> getByMonthAndYear(int month, int year);
	// QUERY 1
	default  List<MonthlyTotalQuoteData> getTotalData(EntityManager entityManager, String query){
		return entityManager.createNativeQuery(query, MonthlyTotalQuoteData.class).getResultList();
	}
	// QUERY 2		
	default List<MonthlyTotalQuotePercentage> getPercentageByCompanyAndMonthAndYear2(EntityManager entityManager, String query){
		return entityManager.createNativeQuery(query, MonthlyTotalQuotePercentage.class).getResultList();
	}
	//QUERY 4
	
	default List<MonthlyTotalQuoteSalesPerson> getTotalSalesPersonCompanyAndMonthAndYear4(EntityManager entityManager, String query){
		return entityManager.createNativeQuery(query, MonthlyTotalQuoteSalesPerson.class).getResultList();
	}

	//@Query(nativeQuery = true, value = "SELECT * FROM [dbo].vwawg_monthly_total_quote_data where company = :company and year = :year and month = :month ")
	//List<MonthlyTotalQuoteDataInterface> getByCompanyAndMonthAndYear(@Param("company") String company,@Param("year") int year,@Param("month") int month);
	
	//@Query(nativeQuery = true, value = "SELECT * FROM [dbo].vwawg_monthly_total_quote_percentage_by_status where company = :company and year = :year and month = :month ")
	//List<MonthlyTotalQuotePercentage> getPercentageByCompanyAndMonthAndYear2(@Param("company") String company,@Param("year") int year,@Param("month") int month);
	
	//@Query(nativeQuery = true, value = "SELECT * FROM [dbo].vwawg_monthly_total_quote_percentage_by_status where company = :company and year = :year order by month ")
	//List<MonthlyTotalQuotePercentage> getPercentageByCompanyAndYear3(@Param("company") String company,@Param("year") int year);
	
	//@Query(nativeQuery = true, value = "SELECT * FROM [dbo].vwawg_total_quote_by_sales_person where company = :company and year = :year and month = :month order by total_amount desc ")
	//List<MonthlyTotalQuoteSalesPerson> getTotalSalesPersonCompanyAndMonthAndYear4(@Param("company") String company,@Param("year") int year,@Param("month") int month);
	
	@Query(nativeQuery = true, value = "SELECT * FROM [dbo].vwawg_total_quote_by_product_category where company = :company and year = :year and month = :month order by total_amount desc ")
	List<MonthlyTotalQuoteProductCategory> getTotalProductCategoryCompanyAndMonthAndYear5(@Param("company") String company,@Param("year") int year,@Param("month") int month);
	
	@Query(nativeQuery = true, value = "SELECT * FROM [dbo].vwawg_total_quote_by_customer_group where company = :company and year = :year and month = :month order by total_amount desc ")
	List<MonthlyTotalQuoteCustomerGroup> getTotalCustomerGroupCompanyAndMonthAndYear6(@Param("company") String company,@Param("year") int year,@Param("month") int month);
}
