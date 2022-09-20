package com.example.actlifecycle;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    public Button bk1_button;
    public Button bk2_button;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Toast.makeText(this,"onCreate Creating C",Toast.LENGTH_SHORT).show();
        bk1_button = findViewById(R.id.bt_back1Button);
        bk2_button = findViewById(R.id.bt_back2Button);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart Creating C",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume Resuming C",Toast.LENGTH_SHORT).show();
        bk2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b2 = new Intent(ThirdActivity.this,SecondActivity.class);
                startActivity(b2);
            }
        });
        bk1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b1 = new Intent(ThirdActivity.this,MainActivity.class);
                startActivity(b1);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop Stopping C",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onRestart Starting C",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy Destroying C",Toast.LENGTH_SHORT).show();
    }
}
