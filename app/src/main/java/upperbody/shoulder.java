package upperbody;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import shoulder.*;
import com.example.balmermwongera.maxifit.R;

public class shoulder extends AppCompatActivity {

    Button shoulder1, shoulder2, shoulder3, shoulder4, shoulder5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulder);


        shoulder1 = findViewById(R.id.btnNeck1);
        shoulder1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(shoulder.this,dumbellPress.class);
                startActivity(i);
            }
        });
        shoulder2 = findViewById(R.id.btnNeck2);
        shoulder2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(shoulder.this,lateralRaise.class);
                startActivity(i);
            }
        });
        shoulder3 = findViewById(R.id.btnNeck3);
        shoulder3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(shoulder.this,reverveFly.class);
                startActivity(i);
            }
        });
        shoulder4 = findViewById(R.id.btnNeck4);
        shoulder4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(shoulder.this,lyingLateral.class);
                startActivity(i);
            }
        });
        shoulder5 = findViewById(R.id.btnNeck5);
        shoulder5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(shoulder.this,frontRaise.class);
                startActivity(i);
            }
        });
    }
}
