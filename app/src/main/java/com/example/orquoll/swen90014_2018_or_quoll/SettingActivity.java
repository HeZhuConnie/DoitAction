package com.example.orquoll.swen90014_2018_or_quoll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class SettingActivity extends AppCompatActivity {

    private Toolbar tb_setting;
    private Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        tb_setting = findViewById(R.id.tb_setting);
        btn_back = findViewById(R.id.btn_back_setting);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}
