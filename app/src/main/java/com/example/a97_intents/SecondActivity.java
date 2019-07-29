package com.example.a97_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv_param;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv_param = findViewById(R.id.lbParamActivPArentid);
        String mainparm = getIntent().getStringExtra(
                "PasoParm");
/*
        int secondparmint = getIntent().getIntExtra(
                "PasoParmEntero", 0);
                */

        tv_param.setText(
                " \n\n\n Es va rebre el paràmetre "
                +tv_param.getText().toString()
                + mainparm
                //+" y ademas "
                //+secondparmint
        );
    }

    public void closeSecondActivity(View view) {
        finish();
    }
}
