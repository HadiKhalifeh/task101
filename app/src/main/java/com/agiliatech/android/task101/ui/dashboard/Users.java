package com.agiliatech.android.task101.ui.dashboard;


public class Users {

    private final String name;
    private final String description;
    private final String image;
    private final String start;
    private final String end;


    public Users(String name, String description,String image,String start,String end) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.start=start;
        this.end=end;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public String getImage() {
        return image;
    }
    public String getStart() {
        return start;
    }
    public String getEnd() {
        return end;
    }
}
