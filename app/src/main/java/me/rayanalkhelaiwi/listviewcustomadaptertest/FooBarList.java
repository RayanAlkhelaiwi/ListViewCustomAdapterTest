package me.rayanalkhelaiwi.listviewcustomadaptertest;

/**
 * Created by Rean on 8/23/2017.
 */

public class FooBarList {

    String mFooWord = "";
    String mBarWord = "";
    int mFooBarImg;

    public FooBarList(String fooWord, String barWord, int fooBarImg) {

        mFooWord = fooWord;
        mBarWord = barWord;
        mFooBarImg = fooBarImg;
    }

    public String getFooWord() {
        return mFooWord;
    }

    public String getBarWord() {
        return mBarWord;
    }

    public int getFooBarImg() {
        return mFooBarImg;
    }
}
