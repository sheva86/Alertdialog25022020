package com.example.alertdiallog25022020;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button mBtnAlert ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnAlert = findViewById(R.id.btnAlert);
        mBtnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Thông báo mơi");
                builder.setMessage("có một tin nhắn mới");
                builder.setIcon(R.mipmap.ic_launcher);
           //Button xác nhận
                builder.setPositiveButton("có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"Có",Toast.LENGTH_LONG).show();
                        dialog.dismiss();
                    }
                });
                //Button từ chối
                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"Không",Toast.LENGTH_LONG).show();
                    }
                });
                //Button hủy
                builder.setNeutralButton("Hủy", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"Hủy",Toast.LENGTH_LONG).show();
                    }
                });
                builder.show();
            }
        });
    }
}
