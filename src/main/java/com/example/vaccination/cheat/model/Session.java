package com.example.vaccination.cheat.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Session {
	
	private Integer center_id;
	private String name;
	private String name_1;
	private String address;
	private String address_1;
	private String state_name;
	private String state_name_1;
	private String district_name;
	private String district_name_1;
	private String block_name;
	private String block_name_1;
	private String pincode;
	private Double lat;
	@JsonProperty("long")
	private Double longitude;
	private String from;
	private String to;
	private String fee_type;
	private String fee;
	private String session_id;
	private String date;
	private Integer available_capacity;
	private Integer available_capacity_dose1;
	private Integer available_capacity_dose2;
	private Integer min_age_limit;
	private String vaccine;
	private List<String> slots;

	public Integer getCenter_id() {
		return center_id;
	}
	public void setCenter_id(Integer center_id) {
		this.center_id = center_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName_1() {
		return name_1;
	}
	public void setName_1(String name_1) {
		this.name_1 = name_1;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress_1() {
		return address_1;
	}
	public void setAddress_1(String address_1) {
		this.address_1 = address_1;
	}
	public String getState_name() {
		return state_name;
	}
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	public String getState_name_1() {
		return state_name_1;
	}
	public void setState_name_1(String state_name_1) {
		this.state_name_1 = state_name_1;
	}
	public String getDistrict_name() {
		return district_name;
	}
	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}
	public String getDistrict_name_1() {
		return district_name_1;
	}
	public void setDistrict_name_1(String district_name_1) {
		this.district_name_1 = district_name_1;
	}
	public String getBlock_name() {
		return block_name;
	}
	public void setBlock_name(String block_name) {
		this.block_name = block_name;
	}
	public String getBlock_name_1() {
		return block_name_1;
	}
	public void setBlock_name_1(String block_name_1) {
		this.block_name_1 = block_name_1;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFee_type() {
		return fee_type;
	}
	public void setFee_type(String fee_type) {
		this.fee_type = fee_type;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public String getSession_id() {
		return session_id;
	}
	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getAvailable_capacity() {
		return available_capacity;
	}
	public void setAvailable_capacity(Integer available_capacity) {
		this.available_capacity = available_capacity;
	}
	public Integer getAvailable_capacity_dose1() {
		return available_capacity_dose1;
	}
	public void setAvailable_capacity_dose1(Integer available_capacity_dose1) {
		this.available_capacity_dose1 = available_capacity_dose1;
	}
	public Integer getAvailable_capacity_dose2() {
		return available_capacity_dose2;
	}
	public void setAvailable_capacity_dose2(Integer available_capacity_dose2) {
		this.available_capacity_dose2 = available_capacity_dose2;
	}
	public Integer getMin_age_limit() {
		return min_age_limit;
	}
	public void setMin_age_limit(Integer min_age_limit) {
		this.min_age_limit = min_age_limit;
	}
	public String getVaccine() {
		return vaccine;
	}
	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}
	public List<String> getSlots() {
		return slots;
	}
	public void setSlots(List<String> slots) {
		this.slots = slots;
	}

}
