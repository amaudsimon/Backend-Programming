package com.example.travelAgencyD288.Entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "CART_ITEMS")
public class CartItem extends Customer{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Cart_Item_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="Vacation_ID")
    private Vacation vacation;

    @OneToMany(mappedBy = "CartItem", cascade = CascadeType.ALL)
    private Set<Excursion> excursions;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn (name="Cart_ID")
    private Cart cart;

    public CartItem(){

    }

    public Vacation getVacation() {
        return vacation;
    }

    public void setVacation(Vacation vacation) {
        this.vacation = vacation;
    }

    public Set<Excursion> getExcursions() {
        return excursions;
    }

    public void setExcursions(Set<Excursion> excursions) {
        this.excursions = excursions;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
