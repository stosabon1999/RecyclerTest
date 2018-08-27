package ru.production.ssobolevsky.recyclertest;

import android.support.v7.widget.RecyclerView;

/**
 * Created by pro on 23.06.2018.
 */

public class TypeBViewHolderBinder extends ViewHolderBinder {

    private ItemB mItem;

    public TypeBViewHolderBinder(BaseItem item, int viewType) {
        super(viewType);
        mItem = (ItemB) item;
    }

    @Override
    public void bindViewHolder(RecyclerView.ViewHolder holder) {
        CustomAdapter.TypeBViewHolder viewHolder = (CustomAdapter.TypeBViewHolder) holder;
        viewHolder.setText(mItem.getText());
        viewHolder.setText2(mItem.getTextTwo());
    }

    @Override
    public BaseItem getItem() {
        return mItem;
    }
}
