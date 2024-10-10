package com.example.testjpa.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
@Entity
@Table(name = "Videos")

@NamedQuery(name = "Video.findAll", query = "SELECT v FROM Video v")

public class Video implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "VideoId")

    private String videoid;

    @Column(name = "Active")

    private int active;

    @Column(name = "Description", columnDefinition = "nvarchar(500) null")

    private String description;

    @Column(name = "Poster", columnDefinition = "nvarchar(500) null")

    private String poster;

    @Column(name = "Title", columnDefinition = "nvarchar(500) null")

    private String title;

    @Column(name = "Views")

    private int views;

    // bi-directional many-to-one association to Category

    @ManyToOne

    @JoinColumn(name = "CategoryId")

    private Category category;

    public String getVideoid() {
        return videoid;
    }

    public void setVideoid(String videoid) {
        this.videoid = videoid;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}