package com.example.travelAgencyD288.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "excursion_cartitem")
public class ExcursionCartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ExcursionCartItem_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Excursion_ID")
    private Excursion excursion;

    @ManyToOne
    @JoinColumn(name = "Cart_Item_ID")
    private CartItem cartItem;

    public ExcursionCartItem() {
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
}
