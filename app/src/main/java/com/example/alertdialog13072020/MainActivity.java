package com.example.alertdialog13072020;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
                buider.setTitle("Chọn 1 trong các con vật");
                buider.setIcon(R.mipmap.ic_launcher);
                buider.setCancelable(false);//ngăn người dùng muốn thoát
                final String[] arrayAnimals = {"Mèo","Cá","Chim","Heo","Gà","Hổ"};
                //lựa chọn
                buider.setSingleChoiceItems(arrayAnimals, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this,arrayAnimals[i], Toast.LENGTH_SHORT).show();
                    }
                });
                //nút tích cực (Thoát ứng dụng)
                buider.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                buider.show();
            }
        });

    }
}