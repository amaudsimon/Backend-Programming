package com.example.travelAgencyD288.Entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="excursions")
public class Excursion{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="excursion_id")
    private Long id;

    @Column(name= "excursion_title")
    private String excursion_title;

    @Column(name = "excursion_price")
    private BigDecimal excursion_price;

    @Column(name="image_url", length=255)
    private String image_URL;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "last_update")
    private Date lastUpdate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="vacation_title")
    private Vacation vacation;


    public Excursion(){

    }

    public Excursion(String firstName, String lastName, String address, String postalCode, String phone, Date createDate, Date lastUpdate, Division division, Set<Cart> carts, String excursion_title, BigDecimal excursion_price, String image_URL, Vacation vacation) {
        this.excursion_title = excursion_title;
        this.excursion_price = excursion_price;
        this.image_URL = image_URL;
        this.vacation = vacation;
    }

    public String getExcursion_title() {
        return excursion_title;
    }

    public void setExcursion_title(String excursion_title) {
        this.excursion_title = excursion_title;
    }

    public BigDecimal getExcursion_price() {
        return excursion_price;
    }

    public void setExcursion_price(BigDecimal excursion_price) {
        this.excursion_price = excursion_price;
    }

    public String getImage_URL() {
        return image_URL;
    }

    public void setImage_URL(String image_URL) {
        this.image_URL = image_URL;
    }

    public Vacation getVacation() {
        return vacation;
    }

    public void setVacation(Vacation vacation) {
        this.vacation = vacation;
    }


    @Override
    public String toString() {
        return "Excursion{" +
                "id=" + id +
                ", excursion_title='" + excursion_title + '\'' +
                ", excursion_price=" + excursion_price +
                ", image_URL='" + image_URL + '\'' +
                ", vacation=" + vacation +
                '}';
    }
}
