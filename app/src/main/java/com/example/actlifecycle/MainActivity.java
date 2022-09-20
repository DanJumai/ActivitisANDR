package com.example.actlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    Declaring Variables here
    public TextView tv_title;
    public Button bt_openSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"onCreate created", Toast.LENGTH_SHORT).show();

        tv_title = findViewById(R.id.tx_firstScreen);
        bt_openSecond = findViewById(R.id.bt_sendButton);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume resumed", Toast.LENGTH_SHORT).show();
//        implementing button click here
        bt_openSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                implement intent here to reach secondActivity
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause paused", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop stopped", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onRestart restarted", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy destroyed", Toast.LENGTH_SHORT).show();
    }
}