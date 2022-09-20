package com.example.actlifecycle;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    public Button bk_button;
    public Button bkC_button;
    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toast.makeText(this,"onCreate Creating B",Toast.LENGTH_SHORT).show();
        bk_button = findViewById(R.id.bt_backButton);
        bkC_button = findViewById(R.id.bt_backCButton);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart Starting B",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume Resuming B",Toast.LENGTH_SHORT).show();
        bkC_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bc = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(bc);
            }
        });
        bk_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(b);

            }
        });

    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause Pausing B",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop Stopping B",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onRestart Restarting B",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy Destroying B",Toast.LENGTH_SHORT).show();
    }
}
