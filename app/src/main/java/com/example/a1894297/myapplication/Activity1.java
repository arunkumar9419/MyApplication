package com.example.a1894297.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity1 extends AppCompatActivity {
import android.content.DialogInterface;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {

        EditText etName, etLast, etEmail, etPass;
        Button btnSubmit, btnExit;
        ImageView ivImage;
        private android.app.AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

    }
}
