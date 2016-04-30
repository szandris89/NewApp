package com.news.tnde.newapp.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.news.tnde.newapp.NewsApplication;
import com.news.tnde.newapp.R;
import com.news.tnde.newapp.model.News;
import com.news.tnde.newapp.presenter.DetailsPresenter;


import javax.inject.Inject;

public class DetailsActivity extends Activity implements DetailsView {
    @Inject
    DetailsPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        NewsApplication.injector.inject(this);

        findViewById(R.id.backButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(v.getContext(), ListActivity.class);
                //startActivity(intent);
            }
        });
        findViewById(R.id.modifyButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                News n = new News(0,1,"a","b", "c");
                presenter.modifyNews(n);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_details, menu);
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
