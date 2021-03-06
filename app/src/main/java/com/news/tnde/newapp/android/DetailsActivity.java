package com.news.tnde.newapp.android;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import com.news.tnde.newapp.R;
import com.news.tnde.newapp.model.News;
import com.news.tnde.newapp.presenter.DetailsPresenter;
import com.news.tnde.newapp.view.DetailsView;


import javax.inject.Inject;

public class DetailsActivity extends Activity implements DetailsView {
    @Inject
    DetailsPresenter presenter;

    private Tracker mTracker;

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

        // Obtain the shared Tracker instance.
        NewsApplication application = (NewsApplication) getApplication();
        mTracker = application.getDefaultTracker();
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

    @Override
    public void update(News n) {
        ((TextView)findViewById(R.id.titleEditText)).setText(n.getTitle());
        ((TextView)findViewById(R.id.textEditText)).setText(n.getText());
        ((TextView)findViewById(R.id.dateEditText)).setText(n.getDate());
        ((TextView)findViewById(R.id.userEditText)).setText(n.getOwnerID());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(this.getClass().getName(), "Setting screen name: " + this.getClass().getName());
        mTracker.setScreenName("Image~" + this.getClass().getName());
        mTracker.send(new HitBuilders.ScreenViewBuilder().build());
    }
}
