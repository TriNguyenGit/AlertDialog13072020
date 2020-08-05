package com.example.alertdialog13072020;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mBtnShowAlert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnShowAlert = findViewById(R.id.showalertdialog);
        mBtnShowAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder buider = new AlertDialog.Builder(MainActivity.this);
                buider.setTitle("Thông báo");
                buider.setMessage("Bạn có muốn thoát ứng dụng");
                buider.setIcon(R.mipmap.ic_launcher);
                buider.setCancelable(false);//ngăn người dùng muốn thoát
                //nút tích cực (Thoát ứng dụng)
                buider.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                //nút tiêu cực (Không thoát)
                buider.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                //nút hủy
                buider.setNeutralButton("Hủy", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                buider.show();
            }
        });

    }
}