package lowerbody;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.balmermwongera.maxifit.R;
import hamstrings.*;

public class hamstrings extends AppCompatActivity {

    Button ham1, ham2, ham3, ham4, ham5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hamstrings);

        ham1 = findViewById(R.id.btnNeck1);
        ham1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(hamstrings.this,lyingCurls.class);
                startActivity(i);
            }
        });
        ham2 = findViewById(R.id.btnNeck2);
        ham2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(hamstrings.this,barbellMorning.class);
                startActivity(i);
            }
        });
        ham3 = findViewById(R.id.btnNeck3);
        ham3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(hamstrings.this,seatedCurls.class);
                startActivity(i);
            }
        });
        ham4 = findViewById(R.id.btnNeck4);
        ham4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(hamstrings.this,thighAbductor.class);
                startActivity(i);
            }
        });
        ham5 = findViewById(R.id.btnNeck5);
        ham5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(hamstrings.this,stiffDeadlift.class);
                startActivity(i);
            }
        });
    }
}
