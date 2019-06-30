package com.example.traings;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.squareup.picasso.Picasso;

public class profilescreen extends AppCompatActivity {

    ImageView showpic;

    TextView gmail;
  TextView phoneno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilescreen);
        showpic = findViewById(R.id.showpic);
        gmail = findViewById(R.id.gmail);
        phoneno =findViewById(R.id.phoneno);
        Picasso.get().load("https://avatars0.githubusercontent.com/u/25736781?s=460&v=4").into(showpic);



        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  intent  = new Intent(profilescreen.this,Main2Activity.class);

                intent.putExtra("gmailing",gmail.getText().toString());

                startActivity(intent);
//                finish();

            }
        });
        phoneno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent =new Intent(profilescreen.this,Main2Activity.class);
//                intent.putExtra("gmailing", phoneno.getText().toString());
//                startActivity(intent);

                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+phoneno.getText().toString()));
                startActivity(intent);

            }
        });

    }
}
