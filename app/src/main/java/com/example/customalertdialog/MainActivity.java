package com.example.customalertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onBackPressed() {

       final AlertDialog.Builder builder=new AlertDialog.Builder(this);
       View view=LayoutInflater.from(this).inflate(R.layout.sample,null);
        builder.setView(view);
       final AlertDialog alertDialog=builder.create();
       Button buttonYes=view.findViewById(R.id.yesButtonId);
       Button buttonNo=view.findViewById(R.id.noButtonId);

       buttonYes.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               finishAffinity();

           }
       });
       buttonNo.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "Back on home", Toast.LENGTH_SHORT).show();
               alertDialog.dismiss();
           }
       });

       alertDialog.show();


    }

}
