package com.mnpw3d.umkcis_guide;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class PostDepartureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_departure);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.profile) {
            Intent i = new Intent(PostDepartureActivity.this,ProfileActicity.class);
            startActivity(i);
        }
        if( id == R.id.action_settings)
        {
            Intent i = new Intent(PostDepartureActivity.this,ChangePassword.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);

    }
    public void quickstart(View v){
        Intent i = new Intent(PostDepartureActivity.this,QuickStartActivity.class);
        startActivity(i);

    }
    public void course(View v){
        Intent i = new Intent(PostDepartureActivity.this,CourseSelectionActivity.class);
        startActivity(i);
    }
    public void accomodation(View v){
        Intent i = new Intent(PostDepartureActivity.this,AccommodationActivity.class);
        startActivity(i);
    }
}
