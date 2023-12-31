package com.example.travelAgencyD288.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="excursions")
public class Excursion{

    @Id
    @Column(name="excursion_id")
    private Long id;

    @Column(name= "excursion_title")
    private String excursion_title;

    @Column(name = "excursion_price")
    private BigDecimal excursion_price;

    @Column(name="image_url", length=255)
    private String image_URL;

    @Column(name = "create_date")
    @CreationTimestamp
    private Date createDate;

    @Column(name = "last_update")
    @UpdateTimestamp
    private Date lastUpdate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="vacation_id")
    private Vacation vacation;


    public Excursion(){

    }

    public Excursion(Long id, String excursion_title, BigDecimal excursion_price, String image_URL, Date createDate, Date lastUpdate, Vacation vacation) {
        this.id = id;
        this.excursion_title = excursion_title;
        this.excursion_price = excursion_price;
        this.image_URL = image_URL;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
        this.vacation = vacation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
