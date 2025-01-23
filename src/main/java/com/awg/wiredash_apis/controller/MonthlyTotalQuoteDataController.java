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
    

    @Operation(summary = "Query 1: Get all Sales Quotation total by grouped by company, month and year ", responses = {
            @ApiResponse(responseCode = "200", description = "Returns an array of products within the price range"),
            @ApiResponse(responseCode = "400", description = "One parameter is missing or invalid in the specified range",
                    content = @Content)
    })
    @GetMapping("/total/{company}/{year}/{month}")
    public ResponseEntity<List<MonthlyTotalQuoteDataInterface>> getByCompanyAndMonthAndYear(@PathVariable String company,@PathVariable int month,@PathVariable int year){
    	List<MonthlyTotalQuoteDataInterface> result = service.getByCompanyAndMonthAndYear(company,year,month);
    	return ResponseEntity.ok().body(result);
    }
    
    @Operation(summary = "Query 2 Get all Sales Quotation total by grouped by company, month and year ", responses = {
            @ApiResponse(responseCode = "200", description = "Returns an array of products within the price range"),
            @ApiResponse(responseCode = "400", description = "One parameter is missing or invalid in the specified range",
                    content = @Content)
    })
    @GetMapping("/percentageByStatus/{company}/{year}/{month}")
    public ResponseEntity<List<MonthlyTotalQuotePercentage>> getPercentageByCompanyAndMonthAndYear(@PathVariable String company,@PathVariable int month,@PathVariable int year){
    	List<MonthlyTotalQuotePercentage> result = service.getPercentageByCompanyAndMonthAndYear2(company,year,month);
    	return ResponseEntity.ok().body(result);
    }
}
