package ru.startandroid.nothing;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by User on 19.01.2017.
 */

public class AboutActivity extends Activity {
    Button but2;
    Button but3;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nikolay);
        but2 = (Button) findViewById(R.id.but2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(AboutActivity.this, MainActivity.class);
                startActivity(Intent);
                                    }
        });

            but3 = (Button) findViewById(R.id.but3);
            but3.setOnClickListener(new View.OnClickListener(){
                @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AboutActivity.this);
                builder.setTitle("Всплывающее окно")
                        .setMessage("наконец-то получилось!")
                        .setNegativeButton("Можно двигаться дальше",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }
}

