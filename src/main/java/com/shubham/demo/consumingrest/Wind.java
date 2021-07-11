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
@JsonPropertyOrder({ "speed", "deg" })
@Generated("jsonschema2pojo")
public class Wind {

	@JsonProperty("speed")
	private Double speed;
	@JsonProperty("deg")
	private Integer deg;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("speed")
	public Double getSpeed() {
		return speed;
	}

	@JsonProperty("speed")
	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public Wind withSpeed(Double speed) {
		this.speed = speed;
		return this;
	}

	@JsonProperty("deg")
	public Integer getDeg() {
		return deg;
	}

	@JsonProperty("deg")
	public void setDeg(Integer deg) {
		this.deg = deg;
	}

	public Wind withDeg(Integer deg) {
		this.deg = deg;
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

	public Wind withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return "Wind [speed=" + speed + ", deg=" + deg + ", additionalProperties=" + additionalProperties + "]";
	}
	
	

}
