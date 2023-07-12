package com.example.travelAgencyD288.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "carts")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private Long id;

    @Column(name = "package_price")
    private BigDecimal packagePrice;

    @Column(name = "party_size")
    private Integer partySize;

    @Column(name = "status")
    private StatusType status;

    @Column(name = "order_tracking_number", length = 255)
    @NotNull
    private String orderTrackingNumber;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "last_update")
    private Date lastUpdate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    private Set<CartItem> cartItems;

    public Cart() {
    }

    public Cart(BigDecimal packagePrice, Integer partySize, StatusType status, String orderTrackingNumber, Date createDate, Date lastUpdate, Customer customer, Set<CartItem> cartItems) {
        this.packagePrice = packagePrice;
        this.partySize = partySize;
        this.status = status;
        this.orderTrackingNumber = orderTrackingNumber;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
        this.customer = customer;
        this.cartItems = cartItems;
    }

    public Long getCartId() {
        return id;
    }

    public void setCartId(Long cartId) {
        this.id = cartId;
    }

    public BigDecimal getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(BigDecimal packagePrice) {
        this.packagePrice = packagePrice;
    }

    public Integer getPartySize() {
        return partySize;
    }

    public void setPartySize(Integer partySize) {
        this.partySize = partySize;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public String getOrderTrackingNumber() {
        return orderTrackingNumber;
    }

    public void setOrderTrackingNumber(String orderTrackingNumber) {
        this.orderTrackingNumber = orderTrackingNumber;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(Set<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartId=" + id +
                ", packagePrice=" + packagePrice +
                ", partySize=" + partySize +
                ", status=" + status +
                ", orderTrackingNumber='" + orderTrackingNumber + '\'' +
                ", createDate=" + createDate +
                ", lastUpdate=" + lastUpdate +
                ", customer=" + customer +
                ", cartItems=" + cartItems +
                '}';
    }
}
