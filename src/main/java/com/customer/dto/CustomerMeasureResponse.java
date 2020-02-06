package com.customer.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * This DTO contains response data for fetched measures. 
 *
 * @author Mahnaz
 * @Jan 31, 2020
 */

public class CustomerMeasureResponse {

	@JsonProperty("name")
	@ApiModelProperty(notes = "name")
	private String name;
	
	@JsonProperty("data")
	@ApiModelProperty(notes = "data")
	private List<Integer> data;

	public CustomerMeasureResponse() {
		super();
	}

	public CustomerMeasureResponse(String name, List<Integer> data) {
		super();
		this.name = name;
		this.data = data;
	}

	public List<Integer> getData() {
		return data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setData(List<Integer> data) {
		this.data = data;
	}
}
