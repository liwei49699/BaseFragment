package com.chengzhen.basefragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.chengzhen.jarlib.StringUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boolean empty = StringUtils.judgeEmpty(":");
        Toast.makeText(this,"是否为空:" + empty,Toast.LENGTH_SHORT).show();
    }
}
