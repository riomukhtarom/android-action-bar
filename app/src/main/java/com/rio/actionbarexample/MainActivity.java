package com.rio.actionbarexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_announcement:
                Toast.makeText(this, getResources().getText(R.string.announcement), Toast.LENGTH_LONG).show();
                return true;

            case R.id.menu_add:
                Toast.makeText(this, getResources().getText(R.string.add), Toast.LENGTH_LONG).show();
                return true;

            case R.id.menu_delete:
                Toast.makeText(this, getResources().getText(R.string.delete), Toast.LENGTH_LONG).show();
                return true;

            case R.id.menu_change_language:
                Toast.makeText(this, getResources().getText(R.string.setting_language), Toast.LENGTH_LONG).show();
                return true;

        }
        return super.onOptionsItemSelected(item);
    }

}
