package ru.production.ssobolevsky.recyclertest;

/**
 * Created by pro on 23.06.2018.
 */

public class ItemC implements BaseItem {

    private String mText = "def";
    private String mTextTwo = "def2";
    private String mTextThree = "def3";

    @Override
    public int getType() {
        return ItemTypes.THREE_TEXT_ITEM.getType();
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public String getTextTwo() {
        return mTextTwo;
    }

    public void setTextTwo(String textTwo) {
        mTextTwo = textTwo;
    }

    public String getTextThree() {
        return mTextThree;
    }

    public void setTextThree(String textThree) {
        mTextThree = textThree;
    }
}
