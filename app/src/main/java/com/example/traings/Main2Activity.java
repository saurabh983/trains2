package com.example.traings;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.squareup.picasso.Picasso;

public class Main2Activity extends AppCompatActivity {

    ImageView imageView, showpic;
    Button clickshowimage, clickshowpic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        clickshowimage = findViewById(R.id.clickshowimage);
        imageView = findViewById(R.id.shoimags);
        clickshowpic =findViewById(R.id.clickshowpic);
        showpic =findViewById(R.id.showpic);

        clickshowpic.setText(getIntent().getStringExtra("gmailing"));

        clickshowimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Picasso.get().load("https://github.com/square/picasso/raw/master/website/static/sample.png").into(imageView);
            }

        });
        showpic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.get().load("https://images.unsplash.com/photo-1472214103451-9374bd1c798e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80").into(showpic);
            }
        });

    }
}
