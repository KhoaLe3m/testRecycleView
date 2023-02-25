package com.example.testrecycleview;

public class Paper {
    String word;
    String des;
    int img;

    public Paper(String word, String des, int img) {
        this.word = word;
        this.des = des;
        this.img = img;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
