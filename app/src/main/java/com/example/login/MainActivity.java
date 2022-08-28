package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// Thiết lập giao diện lấy từ file main.xml
        setContentView(R.layout.activity_main);
// Lấy về các thành phần trong main.xml thông qua id
        final Button btlogin = (Button) findViewById(R.id.btLogin);
//// Thiết lập xử lý cho sự kiện nhấn nút giữa của điện thoại
        btlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(MainActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}