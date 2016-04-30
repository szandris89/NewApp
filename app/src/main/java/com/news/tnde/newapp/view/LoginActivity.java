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
import com.news.tnde.newapp.model.News;
import com.news.tnde.newapp.presenter.LoginPresenter;
import com.news.tnde.newapp.view.MainActivity; 

import javax.inject.Inject;

/**
 * Created by Tünde on 2016.04.30..
 */
public class LoginActivity extends Activity implements LoginView {
    @Inject
    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        NewsApplication.injector.inject(this);

        findViewById(R.id.loginButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = ((TextView) findViewById(R.id.UserNameEditText)).getText().toString();
                String pw = ((TextView) findViewById(R.id.passwordEditText)).getText().toString();
                int userID = presenter.logIn(name, pw);

                // uj activityt el kene inditani, vagyis:
                // Intent intent = new Intent(this, MainActivity.class);
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    /*@Override
    public void updateView(News item) {
        ((TextView)findViewById(R.id.tvHello)).setText(item.getTitle());
    }
*/

}

