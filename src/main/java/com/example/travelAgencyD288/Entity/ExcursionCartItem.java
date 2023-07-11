package com.example.travelAgencyD288.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "excursion_cartitem")
public class ExcursionCartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "excursion_cart_item_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "excursion_id")
    private Excursion excursion;

    @ManyToOne
    @JoinColumn(name = "cart_item_id")
    private CartItem cartItem;

    public ExcursionCartItem() {
    }

    public ExcursionCartItem(Excursion excursion, CartItem cartItem) {
        this.excursion = excursion;
        this.cartItem = cartItem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Excursion getExcursion() {
        return excursion;
    }

    public void setExcursion(Excursion excursion) {
        this.excursion = excursion;
    }

    public CartItem getCartItem() {
        return cartItem;
    }

    public void setCartItem(CartItem cartItem) {
        this.cartItem = cartItem;
    }

    @Override
    public String toString() {
        return "ExcursionCartItem{" +
                "id=" + id +
                ", excursion=" + excursion +
                ", cartItem=" + cartItem +
                '}';
    }
}
