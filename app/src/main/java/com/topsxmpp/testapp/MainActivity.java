package com.topsxmpp.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.topsxmpp.testlibs.LibConstantClass;

public class MainActivity extends AppCompatActivity {

    LibConstantClass libConstantClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        libConstantClass = new LibConstantClass();
        libConstantClass.showToastMessage(this);
    }
}
