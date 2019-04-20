package com.company.firesale.data.entity;

import com.company.firesale.data.entity.User;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Auction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title = null;
    @Column(columnDefinition = "TEXT")
    private String description = null;
    private Date openedAt = null;
    private Date closingTime = null;
    private double startUpPrice = 0;
    private double buyOutPrice = 0;
    private String category = null;


    @ManyToOne
    private User user;

    @Enumerated(value = EnumType.STRING)
    private AuctionStatus status;


    public Auction() {
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getOpenedAt() {
        return openedAt;
    }

    public Date getClosingTime() {
        return closingTime;
    }

    public double getStartUpPrice() {
        return startUpPrice;
    }

    public double getBuyOutPrice() {
        return buyOutPrice;
    }

    public AuctionStatus getStatus() {
        return status;
    }

    public String getCategory() {
        return category;
    }

    public Auction setTitle(String title) {
        this.title = title;
        return this;
    }

    public Auction setDescription(String description) {
        this.description = description;
        return this;
    }

    public Auction setOpenedAt(Date openedAt) {
        this.openedAt = openedAt;
        return this;
    }

    public Auction setClosingTime(Date closingTime) {
        this.closingTime = closingTime;
        return this;
    }

    public Auction setStartUpPrice(double startUpPrice) {
        this.startUpPrice = startUpPrice;
        return this;
    }

    public Auction setBuyOutPrice(double buyOutPrice) {
        this.buyOutPrice = buyOutPrice;
        return this;
    }

    public Auction setStatus(AuctionStatus status) {
        this.status = status;
        return this;
    }

    public Auction setCategory(String category) {
        this.category = category;
        return this;
    }

}