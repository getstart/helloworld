package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText etColCnt;
    private EditText etTotal;
    private Button btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etColCnt = findViewById(R.id.et_columnCount);
        etTotal = findViewById(R.id.et_total);
        btnGo = findViewById(R.id.button);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int c = Integer.parseInt(etColCnt.getText().toString());
                int t = Integer.parseInt(etTotal.getText().toString());
                Log.d("ShowActivity", "m列数："+c+"m总数："+t);
                Bundle b = new Bundle();
                b.putIntArray("inputs", new int[] {c,t});
                Intent intent = new Intent(MainActivity.this, ShowActivity.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });

    }


}
