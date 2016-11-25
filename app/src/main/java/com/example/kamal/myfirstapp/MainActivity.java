package com.example.kamal.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import static java.lang.Math.E;

/**
 * Created by Kamal on 11/25/2016.
 */

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.kamal.MESSAGE";
    @Override
    protected void onCreate(Bundle saveedInstanceStates){
        super.onCreate(saveedInstanceStates);
        setContentView(R.layout.activity_main);
    }
//    dipanggil ketika tombol diklik
    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String pesan = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, pesan);
        startActivity(intent);
    }
}
