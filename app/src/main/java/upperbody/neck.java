package upperbody;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.balmermwongera.maxifit.R;
import neck.*;

public class neck extends AppCompatActivity {
    Button neck1,neck2,neck3,neck4,neck5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neck);

        neck1= findViewById(R.id.btnNeck1);
        neck1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(neck.this, neckFront.class);
                startActivity(i);
            }
        });
        neck2= findViewById(R.id.btnNeck2);
        neck2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(neck.this, neckBack.class);
                startActivity(i);
            }
        });
        neck3= findViewById(R.id.btnNeck3);
        neck3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(neck.this, neckSeated.class);
                startActivity(i);
            }
        });
        neck4= findViewById(R.id.btnNeck4);
        neck4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(neck.this, neckUp.class);
                startActivity(i);
            }
        });
        neck5= findViewById(R.id.btnNeck5);
        neck5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(neck.this, neckDown.class);
                startActivity(i);
            }
        });
    }
}
