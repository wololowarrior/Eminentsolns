package com.solution.eminent.eminentsolns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class createAc extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        Button register=(Button)findViewById(R.id.register);
        Button otp=(Button)findViewById(R.id.enterOtpBtn);
        otp.setOnClickListener(this);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.register:
                LinearLayout otplayout=(LinearLayout)findViewById(R.id.emplinear);
                otplayout.setVisibility(View.VISIBLE);
                break;
            case R.id.enterOtpBtn:
                //code for otp validation
                break;
        }
    }
}
