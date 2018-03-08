package com.tourguide.mytourguide;

/**
 * Created by SaherOs on 1/25/2018.
 */

public class myItem {
    private String mHeadLine ;
    private String mInformation ;
    private int    mImageID = notValidImage ;
    private static final int  notValidImage = -1 ;

    public myItem(){}

    public myItem(String HeadLine , String Information , int ImageID){
        mHeadLine = HeadLine ;
        mInformation = Information ;
        mImageID = ImageID ;
    }

    public myItem(String HeadLine , String Information){
        mHeadLine = HeadLine ;
        mInformation = Information ;
    }

    public String getmHeadLine() {
        return mHeadLine;
    }

    public void setmHeadLine(String mHeadLine) {
        this.mHeadLine = mHeadLine;
    }

    public String getmInformation() {
        return mInformation;
    }

    public void setmInformation(String mInformation) {
        this.mInformation = mInformation;
    }

    public int getmImageID() {
        return mImageID;
    }

    public void setmImageID(int mImageID) {
        this.mImageID = mImageID;
    }

    public boolean hasImage(){
        return mImageID != notValidImage ;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mHeadLine='" + mHeadLine + '\'' +
                ", mInformation='" + mInformation + '\'' +
                ", mImageID=" + mImageID +
                '}';
    }
}

