package com.example.travelAgencyD288.Entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "cart_items")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cart_item_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="vacation_id")
    private Vacation vacation;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn (name="cart_id")
    private Cart cart;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "last_update")
    private Date lastUpdate;




    public CartItem(){

    }

    public CartItem(Vacation vacation, Cart cart) {
        this.vacation = vacation;
        this.cart = cart;
    }

    public Vacation getVacation() {
        return vacation;
    }

    public void setVacation(Vacation vacation) {
        this.vacation = vacation;
    }


    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "id=" + id +
                ", vacation=" + vacation +
                ", cart=" + cart +
                '}';
    }
}
