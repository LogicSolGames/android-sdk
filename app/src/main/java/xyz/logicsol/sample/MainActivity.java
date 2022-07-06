package xyz.logicsol.sample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import xyz.logicsol.sdk.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToasterMessage.s(this, "hello");
    }
}