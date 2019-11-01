package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class afterlogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afterlogin);
        Button back = (Button)findViewById(R.id.button3);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 指定要呼叫的 Activity
                Intent intent = new Intent();
                intent.setClass( afterlogin.this, MainActivity.class );

                // 呼叫登入的Activity
                startActivity( intent );

                // 結束返回畫面
                afterlogin.this.finish();
            }
        });
    }
}
