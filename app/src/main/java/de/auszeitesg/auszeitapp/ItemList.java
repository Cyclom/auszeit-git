package de.auszeitesg.auszeitapp;

/**
 * Created by tilli on 16.09.2017.
 */

class ItemList {

    private int id;
    private String name,price,image;

    public ItemList(int id, String price, String name, String image) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.image = image;
    }

    public ItemList(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public ItemList(String image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setImage(String image) {
        this.image = image;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
