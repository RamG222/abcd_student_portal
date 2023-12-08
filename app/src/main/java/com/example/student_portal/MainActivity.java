package com.example.student_portal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CardView card1,card2,card3,card4;
    TextView textView1;

    String text1,imageString1;
    ImageView imageview1;
    Drawable image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1= findViewById(R.id.card_1);
        card2= findViewById(R.id.card_2);
        card3= findViewById(R.id.card_3);
        card4= findViewById(R.id.card_4);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1=findViewById(R.id.textview1);
                text1=textView1.getText().toString();
//        Toast.makeText(this, text1, Toast.LENGTH_SHORT).show();
                imageview1=findViewById(R.id.image1);
                imageString1= getResources().getResourceEntryName(imageview1.getId());
                Toast.makeText(MainActivity.this, imageString1, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, card1.class);
                intent.putExtra("Text1",text1);
                intent.putExtra("imageString1",imageString1);
                startActivity(intent);
            }
        });

    }

}