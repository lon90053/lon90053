package com.example.a1027.myapp160702;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.a1027.myapp160702.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.a1027.myapp160702.MainActivity;
import com.example.a1027.myapp160702.R;

public class CalendarActivity extends AppCompatActivity  implements View.OnClickListener {
    Button btHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        btHome = (Button) findViewById(R.id.btHome);
        btHome.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btHome :
                this.startActivity(new Intent(this,MainActivity.class));
                break;
        }
    }
}
