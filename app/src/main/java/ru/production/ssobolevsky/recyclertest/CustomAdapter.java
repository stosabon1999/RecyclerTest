package ru.production.ssobolevsky.recyclertest;

import android.content.ClipData;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pro on 22.06.2018.
 */

public class CustomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<ViewHolderBinder> mBinders;
    private SparseArray<ViewHolderFactory> mFactoryMap;
    private List<BaseItem> mData;

    public CustomAdapter(List<BaseItem> data) {
        mData = data;
        mBinders = new ArrayList<>();
        setData(data);
        initFactory();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewHolderFactory factory = mFactoryMap.get(viewType);
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return factory.createViewHolder(parent, inflater);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Log.wtf("TAG", "Position = " + position);
        ViewHolderBinder binder = mBinders.get(position);
        if (binder != null) {
            binder.bindViewHolder(holder);
        }
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    private void initFactory() {
        mFactoryMap = new SparseArray<>();
        mFactoryMap.put(ItemTypes.ONE_TEXT_ITEM.getType(), new TypeAViewHolderFactory());
        mFactoryMap.put(ItemTypes.TWO_TEXT_ITEM.getType(), new TypeBViewHolderFactory());
        mFactoryMap.put(ItemTypes.THREE_TEXT_ITEM.getType(), new TypeCViewHolderFactory());
    }

    public static class TypeAViewHolder extends RecyclerView.ViewHolder {

        private TextView mTextView;

        public TypeAViewHolder(View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.tv_a);
        }

        public void setText(String text) {
            mTextView.setText(text);
        }
    }

    public static class TypeBViewHolder extends RecyclerView.ViewHolder {

        private TextView mTextView;
        private TextView mTextView2;

        public TypeBViewHolder(View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.tv_b_one);
            mTextView2 = itemView.findViewById(R.id.tv_b_two);
        }

        public void setText(String text) {
            mTextView.setText(text);
        }
        public void setText2(String text) {
            mTextView2.setText(text);
        }
    }

    public static class TypeCViewHolder extends RecyclerView.ViewHolder {

        private TextView mTextView;
        private TextView mTextView2;
        private TextView mTextView3;

        public TypeCViewHolder(View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.tv_c_one);
            mTextView2 = itemView.findViewById(R.id.tv_c_two);
            mTextView3 = itemView.findViewById(R.id.tv_c_three);
        }

        public void setText(String text) {
            mTextView.setText(text);
        }

        public void setText2(String text) {
            mTextView2.setText(text);
        }

        public void setText3(String text) {
            mTextView3.setText(text);
        }
    }

    private ViewHolderBinder generateBinder(BaseItem item) {
        if (item.getType() == ItemTypes.ONE_TEXT_ITEM.getType()) {
            return new TypeAViewHolderBinder(item, ItemTypes.ONE_TEXT_ITEM.getType());
        } else if (item.getType() == ItemTypes.TWO_TEXT_ITEM.getType()) {
            return new TypeBViewHolderBinder(item, ItemTypes.TWO_TEXT_ITEM.getType());
        } else if (item.getType() == ItemTypes.THREE_TEXT_ITEM.getType()) {
            return new TypeCViewHolderBinder(item, ItemTypes.THREE_TEXT_ITEM.getType());
        }
        return null;
    }

    public void setData(List<BaseItem> items) {
        mBinders.clear();
        for (BaseItem item : items) {
            mBinders.add(generateBinder(item));
        }
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        if (mData.get(position).getType() == ItemTypes.ONE_TEXT_ITEM.getType()) {
            return ItemTypes.ONE_TEXT_ITEM.getType();
        } else if (mData.get(position).getType() == ItemTypes.TWO_TEXT_ITEM.getType()) {
            return ItemTypes.TWO_TEXT_ITEM.getType();
        } else if (mData.get(position).getType() == ItemTypes.THREE_TEXT_ITEM.getType()) {
            return ItemTypes.THREE_TEXT_ITEM.getType();
        }
        return mData.get(position).getType();
    }
}
