package com.codegym.managerprocesssale.model;

import javax.persistence.*;

@Entity
@Table(name = "image_product")
public class ImageProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer avatar;
    private String url;

    @ManyToOne
    @JoinColumn(name = "image_product_id")
    public Product product;


    public ImageProduct() {

    }

    public ImageProduct(Integer avatar, String url, Product product) {
        this.avatar = avatar;
        this.url = url;
        this.product = product;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAvatar() {
        return avatar;
    }

    public void setAvatar(Integer avatar) {
        this.avatar = avatar;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

