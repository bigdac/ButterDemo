package com.li.butterdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.li.butterkinfe_annotations.BindView;
import com.li.butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_1)
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("TAG", "onCreate: -->"+R.id.tv_1 );
        ButterKnife.bind(this);
        textView.setText("HHHHHHHHHHH");
    }
}
