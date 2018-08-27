package ru.production.ssobolevsky.recyclertest;

import android.support.v7.widget.RecyclerView;

/**
 * Created by pro on 23.06.2018.
 */

public class TypeCViewHolderBinder extends ViewHolderBinder {

    private ItemC mItem;

    public TypeCViewHolderBinder(BaseItem item, int viewType) {
        super(viewType);
        mItem = (ItemC) item;
    }

    @Override
    public void bindViewHolder(RecyclerView.ViewHolder holder) {
        CustomAdapter.TypeCViewHolder viewHolder = (CustomAdapter.TypeCViewHolder) holder;
        viewHolder.setText(mItem.getText());
        viewHolder.setText2(mItem.getTextTwo());
        viewHolder.setText3(mItem.getTextThree());
    }

    @Override
    public BaseItem getItem() {
        return mItem;
    }
}
