package com.shubham.demo.consumingrest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "coord", "weather", "base", "main", "visibility", "wind", "clouds", "dt", "sys", "timezone", "id",
		"name", "cod" })
@Generated("jsonschema2pojo")
public class Root {

	@JsonProperty("coord")
	private Coord coord;
	@JsonProperty("weather")
	private List<Weather> weather = null;
	@JsonProperty("base")
	private String base;
	@JsonProperty("main")
	private Main main;
	@JsonProperty("visibility")
	private Integer visibility;
	@JsonProperty("wind")
	private Wind wind;
	@JsonProperty("clouds")
	private Clouds clouds;
	@JsonProperty("dt")
	private Integer dt;
	@JsonProperty("sys")
	private Sys sys;
	@JsonProperty("timezone")
	private Integer timezone;
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("cod")
	private Integer cod;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("coord")
	public Coord getCoord() {
		return coord;
	}

	@JsonProperty("coord")
	public void setCoord(Coord coord) {
		this.coord = coord;
	}

	public Root withCoord(Coord coord) {
		this.coord = coord;
		return this;
	}

	@JsonProperty("weather")
	public List<Weather> getWeather() {
		return weather;
	}

	@JsonProperty("weather")
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	public Root withWeather(List<Weather> weather) {
		this.weather = weather;
		return this;
	}

	@JsonProperty("base")
	public String getBase() {
		return base;
	}

	@JsonProperty("base")
	public void setBase(String base) {
		this.base = base;
	}

	public Root withBase(String base) {
		this.base = base;
		return this;
	}

	@JsonProperty("main")
	public Main getMain() {
		return main;
	}

	@JsonProperty("main")
	public void setMain(Main main) {
		this.main = main;
	}

	public Root withMain(Main main) {
		this.main = main;
		return this;
	}

	@JsonProperty("visibility")
	public Integer getVisibility() {
		return visibility;
	}

	@JsonProperty("visibility")
	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}

	public Root withVisibility(Integer visibility) {
		this.visibility = visibility;
		return this;
	}

	@JsonProperty("wind")
	public Wind getWind() {
		return wind;
	}

	@JsonProperty("wind")
	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public Root withWind(Wind wind) {
		this.wind = wind;
		return this;
	}

	@JsonProperty("clouds")
	public Clouds getClouds() {
		return clouds;
	}

	@JsonProperty("clouds")
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	public Root withClouds(Clouds clouds) {
		this.clouds = clouds;
		return this;
	}

	@JsonProperty("dt")
	public Integer getDt() {
		return dt;
	}

	@JsonProperty("dt")
	public void setDt(Integer dt) {
		this.dt = dt;
	}

	public Root withDt(Integer dt) {
		this.dt = dt;
		return this;
	}

	@JsonProperty("sys")
	public Sys getSys() {
		return sys;
	}

	@JsonProperty("sys")
	public void setSys(Sys sys) {
		this.sys = sys;
	}

	public Root withSys(Sys sys) {
		this.sys = sys;
		return this;
	}

	@JsonProperty("timezone")
	public Integer getTimezone() {
		return timezone;
	}

	@JsonProperty("timezone")
	public void setTimezone(Integer timezone) {
		this.timezone = timezone;
	}

	public Root withTimezone(Integer timezone) {
		this.timezone = timezone;
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

	public Root withId(Integer id) {
		this.id = id;
		return this;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	public Root withName(String name) {
		this.name = name;
		return this;
	}

	@JsonProperty("cod")
	public Integer getCod() {
		return cod;
	}

	@JsonProperty("cod")
	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Root withCod(Integer cod) {
		this.cod = cod;
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

	public Root withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return "Root [coord=" + coord + ", weather=" + weather + ", base=" + base + ", main=" + main + ", visibility="
				+ visibility + ", wind=" + wind + ", clouds=" + clouds + ", dt=" + dt + ", sys=" + sys + ", timezone="
				+ timezone + ", id=" + id + ", name=" + name + ", cod=" + cod + ", additionalProperties="
				+ additionalProperties + "]";
	}
	
	

}