package com.example.myapplication;

public class Recycleviewer{
    private int mImageResources;
    private String mText1;
    private String mText2;

    public Exampleitem(int ImageResources, String Text1, String Text2){
        mImageResources = ImageResources;
        mText1 = Text1;
        mText2 = Text2;
    }

    public int getmImageResources(){
        return mImageResources;
    }
    public String getmText1() {
        return mText1;
    }

    public String getmText2() {
        return mText2;
    }
}
