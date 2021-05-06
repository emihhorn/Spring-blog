package com.codeup.springblog.models;

import javax.persistence.*;

@Entity
@Table(name = "ads")

public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    private int priceInCents;

    public Ad(long id, String title, String description, int priceInCents) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.priceInCents = priceInCents;
    }

    public Ad() {

    }

    public Ad( String title, String description, int priceInCents) {
        this.title = title;
        this.description = description;
        this.priceInCents = priceInCents;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    public void setPriceInCents(int priceInCents) {
        this.priceInCents = priceInCents;
    }
}
