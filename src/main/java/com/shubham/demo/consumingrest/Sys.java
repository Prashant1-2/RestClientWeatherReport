package com.shubham.demo.consumingrest;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "type", "id", "country", "sunrise", "sunset" })
@Generated("jsonschema2pojo")
public class Sys {

	@JsonProperty("type")
	private Integer type;
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("country")
	private String country;
	@JsonProperty("sunrise")
	private Integer sunrise;
	@JsonProperty("sunset")
	private Integer sunset;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("type")
	public Integer getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(Integer type) {
		this.type = type;
	}

	public Sys withType(Integer type) {
		this.type = type;
		return this;
	}

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	public Sys withId(Integer id) {
		this.id = id;
		return this;
	}

	@JsonProperty("country")
	public String getCountry() {
		return country;
	}

	@JsonProperty("country")
	public void setCountry(String country) {
		this.country = country;
	}

	public Sys withCountry(String country) {
		this.country = country;
		return this;
	}

	@JsonProperty("sunrise")
	public Integer getSunrise() {
		return sunrise;
	}

	@JsonProperty("sunrise")
	public void setSunrise(Integer sunrise) {
		this.sunrise = sunrise;
	}

	public Sys withSunrise(Integer sunrise) {
		this.sunrise = sunrise;
		return this;
	}

	@JsonProperty("sunset")
	public Integer getSunset() {
		return sunset;
	}

	@JsonProperty("sunset")
	public void setSunset(Integer sunset) {
		this.sunset = sunset;
	}

	public Sys withSunset(Integer sunset) {
		this.sunset = sunset;
		return this;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Sys withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return "Sys [type=" + type + ", id=" + id + ", country=" + country + ", sunrise=" + sunrise + ", sunset="
				+ sunset + ", additionalProperties=" + additionalProperties + "]";
	}
	
	

}
