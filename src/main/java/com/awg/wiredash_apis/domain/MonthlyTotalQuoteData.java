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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Integer getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(Integer totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	public BigDecimal getConfirmedAmount() {
		return confirmedAmount;
	}
	public void setConfirmedAmount(BigDecimal confirmedAmount) {
		this.confirmedAmount = confirmedAmount;
	}
	public Integer getConfirmedQuantity() {
		return confirmedQuantity;
	}
	public void setConfirmedQuantity(Integer confirmedQuantity) {
		this.confirmedQuantity = confirmedQuantity;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
    
    
    
}
