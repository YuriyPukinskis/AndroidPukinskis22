package ru.netology.androidpukinskis22;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Random random = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t1 = (TextView) findViewById(R.id.textView);
        t1.setText(Integer.toString(random.nextInt()));
        Button btnForv = (Button) findViewById(R.id.buttonForvard);
        Button btnBack = (Button) findViewById(R.id.buttonBack);
        final Intent intent = new Intent(MainActivity.this,MainActivity.class);

        btnForv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                startActivity(intent);
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
