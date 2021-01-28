package com.example.mimalabo;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FeedbackActivity extends AppCompatActivity {

    EditText editText, editText1, editText2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        editText = findViewById(R.id.edit1);
        editText1 = findViewById(R.id.edit2);
        editText2 = findViewById(R.id.editSubject);
        button = findViewById(R.id.button1);


        Toolbar toolbar = findViewById(R.id.toolbar13);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);


        button.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + editText.getText().toString()));
            intent.putExtra(Intent.EXTRA_SUBJECT,editText2.getText().toString());
            intent.putExtra(Intent.EXTRA_TEXT,"Name: "+editText.getText().toString());

            try {
                startActivity(intent);
            }
            catch (android.content.ActivityNotFoundException exception)
            {
                Toast.makeText(FeedbackActivity.this, "There are no email Clients", Toast.LENGTH_SHORT).show();
            }

        });
    }


}
