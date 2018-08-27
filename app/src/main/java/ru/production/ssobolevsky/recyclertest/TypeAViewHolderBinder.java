package ru.production.ssobolevsky.recyclertest;

import android.support.v7.widget.RecyclerView;
import android.util.Log;

/**
 * Created by pro on 23.06.2018.
 */

public class TypeAViewHolderBinder extends ViewHolderBinder{

    private ItemA mItem;

    public TypeAViewHolderBinder(BaseItem item, int viewType) {
        super(viewType);
        mItem = (ItemA) item;
    }

    @Override
    public void bindViewHolder(RecyclerView.ViewHolder holder) {
        CustomAdapter.TypeAViewHolder viewHolder = (CustomAdapter.TypeAViewHolder) holder;
        viewHolder.setText(mItem.getText());
    }

    @Override
    public BaseItem getItem() {
        return mItem;
    }


}
