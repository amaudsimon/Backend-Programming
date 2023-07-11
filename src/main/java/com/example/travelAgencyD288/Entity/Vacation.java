package com.example.travelAgencyD288.Entity;

import jakarta.persistence.*;


import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="vacations")
public class Vacation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="vacation_id")
    private Long id;
    @Column(name="vacation_title", length = 255)
    private String vacation_title;
    @Column(name="description", length = 255)
    private String description;
    @Column(name="travel_fare", length = 10)
    private BigDecimal travel_price;
    @Column(name="image_url", length = 255)
    private String image_URL;
    @OneToMany(mappedBy = "vacation", cascade = CascadeType.ALL)
    private Set<Excursion> excursions;

    public Vacation(){

    }

    public Vacation(String vacation_title, String description, BigDecimal travel_price, String image_URL, Set<Excursion> excursions) {
        this.vacation_title = vacation_title;
        this.description = description;
        this.travel_price = travel_price;
        this.image_URL = image_URL;
        this.excursions = excursions;
    }

    public Vacation(String firstName, String lastName, String address, String postalCode, String phone, Date createDate, Date lastUpdate, Division division, Set<Cart> carts, String vacation_title, String description, BigDecimal travel_price, String image_URL, Set<Excursion> excursions) {
        this.vacation_title = vacation_title;
        this.description = description;
        this.travel_price = travel_price;
        this.image_URL = image_URL;
        this.excursions = excursions;
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

    @Override
    public String toString() {
        return "Vacation{" +
                "id=" + id +
                ", vacation_title='" + vacation_title + '\'' +
                ", description='" + description + '\'' +
                ", travel_price=" + travel_price +
                ", image_URL='" + image_URL + '\'' +
                ", excursions=" + excursions +
                '}';
    }
}
