package com.example.administrator.activitylife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";
    @BindView(R.id.btn_1)
    Button mBtn1;
    @BindView(R.id.btn_2)
    Button mBtn2;
    @BindView(R.id.btn_3)
    Button mBtn3;

    @OnClick(R.id.btn_1)
    public void onClickBtn1(){
        Log.e(TAG,"进入标准启动模式activity");
        Intent intent = new Intent(this,NormalActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_2)
    public void onClickBtn2(){
        Log.e(TAG,"进入dialog主题activity");
        Intent intent = new Intent(this,DialogActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_3)
    public void onClickBtn3(){
        Log.e(TAG,"进入activity");
        Intent intent = new Intent(this,TransparentActivity.class);
        startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate");
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");
    }


}
