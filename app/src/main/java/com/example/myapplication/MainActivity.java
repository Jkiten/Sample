package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final int RESULT_OK = 1;
    final int DINNER = 2;
    final int QWK = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textview);
        textView.setTextColor(0xFFFF0000);
        int a = 0;
        int bbb=0;
    }
    public void click1(View view){
        //Intent intent =new Intent(getApplicationContext(),MainActivity2.class);
        //startActivity(intent);//단순이동

        Intent intent1 = new Intent(getApplicationContext(),MainActivity2.class);
        startActivityForResult(intent1,RESULT_OK);//갔다가 다시 돌아오는 함수

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == RESULT_OK){
            if(resultCode ==Activity.RESULT_OK){
                System.out.println("잘갔다 왔음");
            }
        }
        else{

        }
    }

    //    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        System.out.println("requestCode : "+requestCode);
//        System.out.println("resultCode : "+resultCode);
//        System.out.println("data : "+data);
//
//        if(requestCode == 1){
//            if(resultCode== Activity.RESULT_OK){
//                System.out.println("성공적으로 돌아");
//            }
//        }
//    }
}