package com.news.tnde.newapp.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.news.tnde.newapp.NewsApplication;
import com.news.tnde.newapp.R;


import com.news.tnde.newapp.R;
import com.news.tnde.newapp.model.News;
import com.news.tnde.newapp.presenter.SearchPresenter;

import java.util.ArrayList;

import javax.inject.Inject;

public class SearchActivity extends Activity implements SearchView{
    @Inject
    SearchPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        NewsApplication.injector.inject(this);

        findViewById(R.id.searchButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = (String) ((TextView)findViewById(R.id.titleEditText)).getText();
                String user = (String) ((TextView)findViewById(R.id.userEditText)).getText();
                ArrayList<News> l = presenter.getSearchList();

                // A kapott listat ki kene tenni a masik activity-re

                Intent intent = new Intent(v.getContext(), ListActivity.class);
                startActivity(intent);
                // frissites
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_search, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
