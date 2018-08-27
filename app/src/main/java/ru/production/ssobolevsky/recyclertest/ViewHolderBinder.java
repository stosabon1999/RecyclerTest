package ru.production.ssobolevsky.recyclertest;

import android.support.v7.widget.RecyclerView;

/**
 * Created by pro on 23.06.2018.
 */

public abstract class ViewHolderBinder {

    private final int viewType;

    public ViewHolderBinder(int viewType) {
        this.viewType = viewType;
    }

    public abstract void bindViewHolder(RecyclerView.ViewHolder holder);

    public abstract BaseItem getItem();
}
