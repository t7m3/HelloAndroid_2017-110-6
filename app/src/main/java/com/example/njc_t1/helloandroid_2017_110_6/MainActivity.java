package com.example.njc_t1.helloandroid_2017_110_6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(View view){
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("ボタンがタップされました");
    }

    public void onClickButton_r(View view){
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("こんにちは！アンドロイド");
    }
}
