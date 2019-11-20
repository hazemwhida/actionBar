package com.hazem.actionbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
a=findViewById(R.id.myText);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.setting:
               a.setText(getString(R.string.setting));
                return true;

            case R.id.home:
                a.setText(getResources().getString(R.string.home));
                return true;

            case R.id.itemA:
                a.setText(getResources().getString(R.string.itemA));
                return true;

            case R.id.itemB:
                a.setText(getResources().getString(R.string.itemB));
                return true;

            case R.id.search:
                a.setText(getResources().getString(R.string.search));
                return true;

        }
        return super.onOptionsItemSelected(item);

}
}