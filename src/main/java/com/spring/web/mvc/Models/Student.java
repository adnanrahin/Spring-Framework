package com.spring.web.mvc.Models;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private String firstName;
    private String lastName;
    private String country;

    private Map<String, String> countries;

    public Student() {
        countries = new HashMap<>();
        countries.put("AUS", "Australia");
        countries.put("USA", "United States");
        countries.put("DEN", "Denmark");
        countries.put("NZL", "New Zealand");

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Map<String, String> getCountries() {
        return countries;
    }

    public void setCountries(Map<String, String> countries) {
        this.countries = countries;
    }
}
