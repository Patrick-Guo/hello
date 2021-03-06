package com.example.patrick.pulltorefresh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Patrick on 16/5/10.
 */
public class MyAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private Context context;
    private List<String> mData;

    public MyAdapter(Context context, List<String> mData){
        this.mInflater = LayoutInflater.from(context);
        this.mData = mData;
        this.context = context;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, null);
        }

        TextView tv = (TextView) convertView.findViewById(R.id.tv);
        String s = mData.get(position);
        if (s != null){
            tv.setText(s);
        }

        return convertView;
    }
}
