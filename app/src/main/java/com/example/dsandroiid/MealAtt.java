package com.example.dsandroiid;

public class MealAtt {

    int Image;
    String Title;
    String Content;

    public MealAtt(int image, String title, String content) {
        Image = image;
        Title = title;
        Content = content;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
