package ru.production.ssobolevsky.recyclertest;

/**
 * Created by pro on 23.06.2018.
 */

public class ItemB implements BaseItem {

    private String mText = "def";
    private String mTextTwo = "def2";

    @Override
    public int getType() {
        return ItemTypes.TWO_TEXT_ITEM.getType();
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
}
