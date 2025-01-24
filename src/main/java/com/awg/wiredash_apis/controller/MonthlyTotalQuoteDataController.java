package com.awg.wiredash_apis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.awg.wiredash_apis.domain.MonthlyTotalQuoteData;
import com.awg.wiredash_apis.model.MonthlyTotalQuoteCustomerGroup;
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
    

    @Operation(summary = "1. Get all Sales Quotation total grouped by company, month and year ", responses = {
            @ApiResponse(responseCode = "200", description = "Returns an array of Quotations for the given params"),
            @ApiResponse(responseCode = "400", description = "One parameter is missing or invalid",
                    content = @Content)
    })
    @GetMapping("/total")
    public ResponseEntity<List<MonthlyTotalQuoteData>> getByCompanyAndMonthAndYear(@RequestParam(name = "company", required = false) String company,@RequestParam(name = "year", required = false) Integer year,@RequestParam(name = "month", required = false) Integer month){
    	List<MonthlyTotalQuoteData> result = service.getByCompanyAndMonthAndYear(company,year,month);
    	return ResponseEntity.ok().body(result);
    }
    
    
    @Operation(summary = "2. and 3 Get all Sales Quotation totals and monthly percentage grouped by company, month, year and status", responses = {
            @ApiResponse(responseCode = "200", description = "Returns an array of Quotations for the given params"),
            @ApiResponse(responseCode = "400", description = "One parameter is missing or invalid",
                    content = @Content)
    })
    @GetMapping("/percentageByStatus")
    public ResponseEntity<List<MonthlyTotalQuotePercentage>> getPercentageByCompanyAndMonthAndYear(@RequestParam(name = "company", required = false) String company,@RequestParam(name = "year", required = false) Integer year,@RequestParam(name = "month", required = false) Integer month){
    	List<MonthlyTotalQuotePercentage> result = service.getPercentageByCompanyAndMonthAndYear2(company,year,month);
    	return ResponseEntity.ok().body(result);
    }
    
    @Operation(summary = "4. Get all Sales Quotation total by Sales person grouped by company, month and year ", responses = {
            @ApiResponse(responseCode = "200", description = "Returns an array of Quotations for the given params"),
            @ApiResponse(responseCode = "400", description = "One parameter is missing or invalid",
                    content = @Content)
    })
    @GetMapping("/totalBySalesPerson")
    public ResponseEntity<List<MonthlyTotalQuoteSalesPerson>> getTotalSalesPersonByCompanyAndMonthAndYear(@RequestParam(name = "company", required = false) String company,@RequestParam(name = "year", required = false) Integer year,@RequestParam(name = "month", required = false) Integer month){
    	List<MonthlyTotalQuoteSalesPerson> result = service.getTotalSalesPersonCompanyAndMonthAndYear4(company,year,month);
    	return ResponseEntity.ok().body(result);
    }
    
    @Operation(summary = "5. Get all Sales Quotation total by product category grouped by company, month and year ", responses = {
            @ApiResponse(responseCode = "200", description = "Returns an array of Quotations for the given params"),
            @ApiResponse(responseCode = "400", description = "One parameter is missing or invalid",
                    content = @Content)
    })
    @GetMapping("/totalByProductCategory/{company}/{year}/{month}")
    public ResponseEntity<List<MonthlyTotalQuoteProductCategory>> getTotalProductCategoryByCompanyAndMonthAndYear(@PathVariable String company,@PathVariable int year,@PathVariable int month){
    	List<MonthlyTotalQuoteProductCategory> result = service.getTotalProductCategoryCompanyAndMonthAndYear5(company,year,month);
    	return ResponseEntity.ok().body(result);
    }
    
    @Operation(summary = "6. Get all Sales Quotation total by customer group grouped by company, month and year ", responses = {
            @ApiResponse(responseCode = "200", description = "Returns an array of Quotations for the given params"),
            @ApiResponse(responseCode = "400", description = "One parameter is missing or invalid",
                    content = @Content)
    })
    @GetMapping("/totalByCustomerGroup/{company}/{year}/{month}")
    public ResponseEntity<List<MonthlyTotalQuoteCustomerGroup>> getTotalCustomerGroupByCompanyAndMonthAndYear(@PathVariable String company,@PathVariable int year,@PathVariable int month){
    	List<MonthlyTotalQuoteCustomerGroup> result = service.getTotalCustomerGroupCompanyAndMonthAndYear6(company,year,month);
    	return ResponseEntity.ok().body(result);
    }
    
}
