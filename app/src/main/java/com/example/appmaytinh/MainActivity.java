package com.example.appmaytinh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btLinearLayout,btRelatiLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btRelatiLayout.setOnClickListener(this);
        btLinearLayout.setOnClickListener(this);
    }
    public void init(){
        btLinearLayout = findViewById(R.id.btLinearLayout);
        btRelatiLayout = findViewById(R.id.btRelatiLayout);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btLinearLayout:{
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,LinearLayout.class);
                startActivity(intent);
                break;
            }
            case R.id.btRelatiLayout:{
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,RelatiLayout.class);
                startActivity(intent);
                break;
            }
        }
    }
}
