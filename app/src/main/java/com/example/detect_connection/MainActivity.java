package com.example.detect_connection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.net.ssl.HttpsURLConnection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void replaceImage(View view)
    {
        int rnd = new Random().nextInt(3);
        Log.d("[App:number]", "Number generated: " + rnd);
        ImageView statusImage = (ImageView) findViewById(R.id.connStatus);
        switch (rnd){
            case 0:
                statusImage.setImageResource(R.drawable.success);
                break;
            case 1:
                statusImage.setImageResource(R.drawable.error);
                break;
            case 2:
                statusImage.setImageResource(R.drawable.random);
                break;
        }
    }
}