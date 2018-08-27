package ru.production.ssobolevsky.recyclertest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by pro on 22.06.2018.
 */

public class TypeBViewHolderFactory implements ViewHolderFactory {
    @Override
    public RecyclerView.ViewHolder createViewHolder(ViewGroup parent, LayoutInflater inflater) {
        View itemView = inflater.inflate(R.layout.type_b, parent,false);
        RecyclerView.ViewHolder viewHolder = new CustomAdapter.TypeBViewHolder(itemView);
        return viewHolder;
    }
}
