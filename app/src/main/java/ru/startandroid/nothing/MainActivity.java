package ru.startandroid.nothing;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button but1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
       but1 = (Button) findViewById(R.id.but1);
       but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent Intent = new Intent(MainActivity.this, AboutActivity.class);
                  startActivity(Intent);

            }
//            View.OnClickListener oclBut1 = new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent Intent = new Intent(MainActivity.this, AboutActivity.class);
//                    startActivity(Intent);
//                    but1.setOnClickListener(oclBut1);
//                }
//            };
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
}
