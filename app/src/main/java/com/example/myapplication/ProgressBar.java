package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProgressBar extends AppCompatActivity {
     ProgressBar progressbar;
    private Button button;
     int progressValue=0;
     TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);


textView=findViewById(R.id.textitem);
 //progressbar=findViewById(R.id.progress1);
button=findViewById(R.id.btn);

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if(progressValue<100){
            progressValue +=10;
            progressbar.setProgress(progressValue);
            textView.setText(String.valueOf(progressValue));
        }
    }
});


    }
}


