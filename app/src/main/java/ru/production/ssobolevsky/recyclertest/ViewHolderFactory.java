package ru.production.ssobolevsky.recyclertest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * Created by pro on 22.06.2018.
 */

public interface ViewHolderFactory {

    RecyclerView.ViewHolder createViewHolder(ViewGroup parent, LayoutInflater inflater);
}
