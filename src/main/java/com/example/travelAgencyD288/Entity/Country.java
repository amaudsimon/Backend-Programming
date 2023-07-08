package com.example.travelAgencyD288.Entity;

import java.util.Date;
import java.util.Set;

public class Country extends Customer {
    private String country_name;
    private Set<Division> divisions;

    public Country(){

    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public Set<Division> getDivisions() {
        return divisions;
    }

    public void setDivisions(Set<Division> divisions) {
        this.divisions = divisions;
    }

}
