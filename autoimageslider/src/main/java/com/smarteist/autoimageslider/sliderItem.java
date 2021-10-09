package com.smarteist.autoimageslider;

public class sliderItem {
    String ImageUrl;
    String ImageTitle;

    public String getImageUrl() {
        return ImageUrl;
    }

    public sliderItem setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
        return this;
    }

    public String getImageTitle() {
        return ImageTitle;
    }

    public sliderItem setImageTitle(String imageTitle) {
        ImageTitle = imageTitle;
        return this;
    }
}
