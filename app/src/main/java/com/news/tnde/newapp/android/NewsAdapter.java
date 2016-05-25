package com.news.tnde.newapp.android;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.news.tnde.newapp.model.News;

import java.util.HashMap;
import java.util.List;


/**
 * Created by Tünde on 2016.05.25..
 */
public class NewsAdapter extends ArrayAdapter<News> {

    HashMap<News, Integer> mIdMap = new HashMap<News, Integer>();

    public NewsAdapter(Context context, int textViewResourceId, List<News> objects){
        super(context, textViewResourceId, objects);
        for (int i = 0; i < objects.size(); i++){
            mIdMap.put(objects.get(i), i);
        }
    }

    @Override
    public long getItemId(int position){
        News item = getItem(position);
        return mIdMap.get(item);
    }

    @Override
    public boolean hasStableId(){
        return true;
    }

}








