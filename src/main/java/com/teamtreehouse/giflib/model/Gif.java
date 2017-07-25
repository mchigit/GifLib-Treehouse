package com.teamtreehouse.giflib.model;

import java.time.LocalDate;

/**
 * Created by MICHAELChi on 2017-07-24.
 */
public class Gif {
    private String name;
    private LocalDate dateUploaded;
    private String username;
    private boolean favorite;
    private int categoryID;

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public Gif(String name, LocalDate dateUploaded, String username, boolean favorite, int categoryID) {
        this.name = name;
        this.dateUploaded = dateUploaded;
        this.username = username;
        this.favorite = favorite;
        this.categoryID = categoryID;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }



}
