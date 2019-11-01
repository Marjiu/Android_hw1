package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //登入按鈕
        Button login = (Button) findViewById(R.id.button);
        //Onclick 觸發鈕
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                // 指定要呼叫的 Activity
                Intent intent = new Intent();
                intent.setClass( MainActivity.this, afterlogin.class );

                // 呼叫登入後的Activity
                startActivity( intent );

                // 結束登入畫面
                MainActivity.this.finish();
            }


        });
    }


}
