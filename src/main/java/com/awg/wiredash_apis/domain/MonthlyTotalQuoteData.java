package com.awg.wiredash_apis.domain;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "vwawg_monthly_total_quote_data")
public class MonthlyTotalQuoteData {
    @Id
	private String id;
    private String company;
    private BigDecimal totalAmount;
    private Integer totalQuantity;
    private BigDecimal confirmedAmount;
    private Integer confirmedQuantity;
    private int month;
    private int year;
    
}
