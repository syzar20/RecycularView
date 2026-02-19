package com.example.recycularview;

public class AppItem {
    private final int rank;
    private final String name;
    private final String category;
    private final String rating;
    private final String size;
    private final int imageResId;

    public AppItem(int rank, String name, String category, String rating, String size, int imageResId) {
        this.rank = rank;
        this.name = name;
        this.category = category;
        this.rating = rating;
        this.size = size;
        this.imageResId = imageResId;
    }

    public int getRank() { return rank; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public String getRating() { return rating; }
    public String getSize() { return size; }
    public int getImageResId() { return imageResId; }
}