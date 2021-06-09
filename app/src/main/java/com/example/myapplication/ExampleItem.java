package com.example.myapplication;

public class ExampleItem{
    private int mImageResources;
    private int mText1,mText2;

    public ExampleItem(int ImageResources, int Text1, int Text2){
        mImageResources = ImageResources;
        mText1 = Text1;
        mText2 = Text2;
    }

    public int getmImageResources(){
        return mImageResources;
    }
    public int getmText1() {
        return mText1;
    }

    public int getmText2() {
        return mText2;
    }
}
