package ru.production.ssobolevsky.recyclertest;

/**
 * Created by pro on 22.06.2018.
 */

public enum ItemTypes implements BaseItem {

    ONE_TEXT_ITEM(1),
    TWO_TEXT_ITEM(2),
    THREE_TEXT_ITEM(3);

    int type;

    ItemTypes(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

}
