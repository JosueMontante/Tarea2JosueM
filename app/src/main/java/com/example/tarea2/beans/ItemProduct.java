package com.example.tarea2.beans;

public class ItemProduct {
    private int image;
    private String title;
    private String store;
    private String localitation;
    private String phone;
    private String description;

    public ItemProduct(int image, String title, String store, String localitation, String phone, String description) {
        this.image = image;
        this.title = title;
        this.store = store;
        this.localitation = localitation;
        this.phone = phone;
        this.description = description;
    }

    public ItemProduct() {
        setImage(0);
        setDescription("");
        setLocalitation("");
        setPhone("");
        setStore("");
        setTitle("");
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getLocalitation() {
        return localitation;
    }

    public void setLocalitation(String localitation) {
        this.localitation = localitation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ItemProduct{" +
                "image=" + image +
                ", title='" + title + '\'' +
                ", store='" + store + '\'' +
                ", localitation='" + localitation + '\'' +
                ", phone='" + phone + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

