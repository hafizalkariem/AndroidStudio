package com.HafizApps;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Second_Activity extends AppCompatActivity {
    public static final String EXTRA_REPLY = "com.example.android.latihan1.extra.REPLY";
    private EditText mReply;

    @Override
    protected void onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_dua);
        mReply = findViewById(R.id.editText_second);
        Intent muncul = getIntent();
        String isiSurat = muncul.getStringExtra(com.HafizApps.First_Activity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.text_message);
        textView.setText(isiSurat);
    }
    public void returnReply(View view){
        String bales = mReply.getText().toString();
        Intent balesIntent = new Intent();
        balesIntent.putExtra(EXTRA_REPLY, bales);
        setResult(RESULT_OK, balesIntent);
        finish();
    }

}