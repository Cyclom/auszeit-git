package de.auszeitesg.auszeitapp;

/**
 * Created by Admin on 18.09.2017.
 */

public class CategoryList {
    private int id;
    private String name, image, desc;

    public CategoryList(int id, String name, String image, String desc) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.desc = desc;

    }


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CategoryList(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public CategoryList(String image) {
        this.image = image;
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
