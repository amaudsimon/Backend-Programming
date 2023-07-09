package com.example.travelAgencyD288.Entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name="EXCURSIONS")
public class Excursion extends Customer{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Excursion_ID")
    private Long id;

    @Column(name= "Excursion_Title")
    private String excursion_title;

    @Column(name = "Excursion_price")
    private BigDecimal excursion_price;

    @Column(name="Image_URL", length=255)
    private String image_URL;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="Vacation_ID")
    private Vacation vacation;


    @OneToMany(mappedBy = "Excursion", cascade = CascadeType.ALL)
    private Set<CartItem> cartItems;

    public Excursion(){

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

    public Set<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(Set<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
}
