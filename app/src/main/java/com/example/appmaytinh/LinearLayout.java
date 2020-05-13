package com.example.appmaytinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LinearLayout extends AppCompatActivity implements View.OnClickListener {
    EditText edso1,edso2;
    TextView tvresult;
    Button btcong,btTru,btchia,btnhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
        init();
        //onclicked
        btcong.setOnClickListener(this);
        btTru.setOnClickListener(this);
        btnhan.setOnClickListener(this);
        btchia.setOnClickListener(this);
    }

    public void init(){
        edso1 = findViewById(R.id.edso1);
        edso2 = findViewById(R.id.edso2);
        tvresult = findViewById(R.id.tvresul);
        btcong = findViewById(R.id.btcong);
        btchia = findViewById(R.id.btchia);
        btTru = findViewById(R.id.btTru);
        btnhan =findViewById(R.id.btnhan);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btcong:{
                String so1tx = edso1.getText().toString();
                String so2tx = edso2.getText().toString();
                if(so1tx.isEmpty()||so1tx.length()==0 || so2tx.isEmpty()||so2tx.length() == 0||so1tx == null||so2tx == null){
                    Toast.makeText(LinearLayout.this,"khong duoc de trong",Toast.LENGTH_SHORT).show();
                }else {
                    Double so1 = Double.parseDouble(edso1.getText().toString());
                    Double so2 = Double.parseDouble(edso2.getText().toString());
                    Double ketqua = so1+so2;
                    String result = ""+ketqua;
                    tvresult.setText(result);
                    break;
                }

            }
            case R.id.btTru:{
                Double so1 = Double.parseDouble(edso1.getText().toString());
                Double so2 = Double.parseDouble(edso2.getText().toString());
                Double ketqua = so1-so2;
                String result = ""+ketqua;
                tvresult.setText(result);
                break;
            }
            case R.id.btchia:{
                Double so1 = Double.parseDouble(edso1.getText().toString());
                Double so2 = Double.parseDouble(edso2.getText().toString());
                if(so2 == 0){
                    Toast.makeText(LinearLayout.this,"không chia được cho số 0",Toast.LENGTH_SHORT).show();
                }else{
                    Double ketqua = so1/so2;
                    String result = ""+ketqua;
                    tvresult.setText(result);
                }

                break;
            }
            case R.id.btnhan:{
                Double so1 = Double.parseDouble(edso1.getText().toString());
                Double so2 = Double.parseDouble(edso2.getText().toString());
                Double ketqua = so1*so2;
                String result = ""+ketqua;
                tvresult.setText(result);
                break;
            }
        }
    }
}
