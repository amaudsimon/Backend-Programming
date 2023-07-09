package com.example.travelAgencyD288.Entity;

import jakarta.persistence.*;


import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name="VACATIONS")
public class Vacation extends Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Vacation_ID")
    private Long id;
    @Column(name="Vaction_Title", length = 255)
    private String vacation_title;
    @Column(name="Description", length = 255)
    private String description;
    @Column(name="Travel_Fare", length = 10)
    private BigDecimal travel_price;
    @Column(name="Image_URL", length = 255)
    private String image_URL;
    @OneToMany(mappedBy = "Vacation", cascade = CascadeType.ALL)
    private Set<Excursion> excursions;

    public Vacation(){

    }

    public String getVacation_title() {
        return vacation_title;
    }

    public void setVacation_title(String vacation_title) {
        this.vacation_title = vacation_title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getTravel_price() {
        return travel_price;
    }

    public void setTravel_price(BigDecimal travel_price) {
        this.travel_price = travel_price;
    }

    public String getImage_URL() {
        return image_URL;
    }

    public void setImage_URL(String image_URL) {
        this.image_URL = image_URL;
    }

    public Set<Excursion> getExcursions() {
        return excursions;
    }

    public void setExcursions(Set<Excursion> excursions) {
        this.excursions = excursions;
    }
}
