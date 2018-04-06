package com.example.android.cookies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnAction(View view){

                TextView text = (TextView) findViewById(R.id.hungry);
                text.setText("I\'m full");
                ImageView img = (ImageView) findViewById(R.id.cookie);
                img.setImageResource(R.drawable.after_cookie);

    }
}
