package com.awg.wiredash_apis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.awg.wiredash_apis.model.MonthlyTotalQuoteDataInterface;
import com.awg.wiredash_apis.model.MonthlyTotalQuotePercentage;
import com.awg.wiredash_apis.model.MonthlyTotalQuoteProductCategory;
import com.awg.wiredash_apis.model.MonthlyTotalQuoteSalesPerson;
import com.awg.wiredash_apis.service.MonthlyTotalQuoteDataService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(path = "/quotes")
@Tag(name = "quotes", description = "Request mapping for servicing quote api calls")
public class MonthlyTotalQuoteDataController {
    @Autowired
    private MonthlyTotalQuoteDataService service;
    

    @Operation(summary = "Query 1: Get all Sales Quotation total grouped by company, month and year ", responses = {
            @ApiResponse(responseCode = "200", description = "Returns an array of Quotations for the given params"),
            @ApiResponse(responseCode = "400", description = "One parameter is missing or invalid",
                    content = @Content)
    })
    @GetMapping("/total/{company}/{year}/{month}")
    public ResponseEntity<List<MonthlyTotalQuoteDataInterface>> getByCompanyAndMonthAndYear(@PathVariable String company,@PathVariable int year,@PathVariable int month){
    	List<MonthlyTotalQuoteDataInterface> result = service.getByCompanyAndMonthAndYear(company,year,month);
    	return ResponseEntity.ok().body(result);
    }
    
    @Operation(summary = "Query 2 Get all Sales Quotation totals and monthly percentage grouped by company, month, year and status", responses = {
            @ApiResponse(responseCode = "200", description = "Returns an array of Quotations for the given params"),
            @ApiResponse(responseCode = "400", description = "One parameter is missing or invalid",
                    content = @Content)
    })
    @GetMapping("/percentageByStatus/{company}/{year}/{month}")
    public ResponseEntity<List<MonthlyTotalQuotePercentage>> getPercentageByCompanyAndMonthAndYear(@PathVariable String company,@PathVariable int year,@PathVariable int  month){
    	List<MonthlyTotalQuotePercentage> result = service.getPercentageByCompanyAndMonthAndYear2(company,year,month);
    	return ResponseEntity.ok().body(result);
    }
    
    @Operation(summary = "Query 3 Get all Sales Quotation totals and monthly percentage for a year grouped by grouped by company, month and year and status", responses = {
            @ApiResponse(responseCode = "200", description = "Returns an array of Quotations for the given params"),
            @ApiResponse(responseCode = "400", description = "One parameter is missing or invalid",
                    content = @Content)
    })
    @GetMapping("/percentageByStatus/{company}/{year}")
    public ResponseEntity<List<MonthlyTotalQuotePercentage>> getPercentageByCompanyAndYear(@PathVariable String company,@PathVariable int year){
    	List<MonthlyTotalQuotePercentage> result = service.getPercentageByCompanyAndYear3(company,year);
    	return ResponseEntity.ok().body(result);
    }
    
    @Operation(summary = "Query 4: Get all Sales Quotation total by Sales person grouped by company, month and year ", responses = {
            @ApiResponse(responseCode = "200", description = "Returns an array of Quotations for the given params"),
            @ApiResponse(responseCode = "400", description = "One parameter is missing or invalid",
                    content = @Content)
    })
    @GetMapping("/totalBySalesPerson/{company}/{year}/{month}")
    public ResponseEntity<List<MonthlyTotalQuoteSalesPerson>> getTotalSalesPersonByCompanyAndMonthAndYear(@PathVariable String company,@PathVariable int year,@PathVariable int month){
    	List<MonthlyTotalQuoteSalesPerson> result = service.getTotalSalesPersonCompanyAndMonthAndYear4(company,year,month);
    	return ResponseEntity.ok().body(result);
    }
    
    @Operation(summary = "Query 4: Get all Sales Quotation total by Sales person grouped by company, month and year ", responses = {
            @ApiResponse(responseCode = "200", description = "Returns an array of Quotations for the given params"),
            @ApiResponse(responseCode = "400", description = "One parameter is missing or invalid",
                    content = @Content)
    })
    @GetMapping("/totalByProductCategory/{company}/{year}/{month}")
    public ResponseEntity<List<MonthlyTotalQuoteProductCategory>> getTotalProductCategoryByCompanyAndMonthAndYear(@PathVariable String company,@PathVariable int year,@PathVariable int month){
    	List<MonthlyTotalQuoteProductCategory> result = service.getTotalProductCategoryCompanyAndMonthAndYear5(company,year,month);
    	return ResponseEntity.ok().body(result);
    }
    
}
