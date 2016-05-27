package com.news.tnde.newapp.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import com.news.tnde.newapp.R;


import com.news.tnde.newapp.R;
import com.news.tnde.newapp.model.News;
import com.news.tnde.newapp.presenter.SearchPresenter;
import com.news.tnde.newapp.view.SearchView;

import java.util.ArrayList;

import javax.inject.Inject;

public class SearchActivity extends Activity implements SearchView {
    @Inject
    SearchPresenter presenter;

    private Tracker mTracker;

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

        // Obtain the shared Tracker instance.
        NewsApplication application = (NewsApplication) getApplication();
        mTracker = application.getDefaultTracker();
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

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(this.getClass().getName(), "Setting screen name: " + this.getClass().getName());
        mTracker.setScreenName("Image~" + this.getClass().getName());
        mTracker.send(new HitBuilders.ScreenViewBuilder().build());
    }
}
