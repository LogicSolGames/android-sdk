package xyz.logicsol.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import xyz.logicsol.sdk.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ToasterMessage.c(this, "hello");
    }
}