package app.housenow.com.housenow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import app.housenow.com.housenow.view.LoginActivity;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }

    public void ClickTest(View view) {
        Intent intent = new Intent(this, ReferenciaTabsActivity.class);//LoginActivity
        startActivity(intent);
    }
}
