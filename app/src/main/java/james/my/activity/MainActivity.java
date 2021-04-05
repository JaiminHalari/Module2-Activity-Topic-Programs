package james.my.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    String value = null;
    Button i1task,i2task,i3task,i4task,a1task,a2task;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.resulti4);

        String sumdata = getIntent().getStringExtra("add");

        textView.setText("Sum is : " + sumdata);

        i1task = findViewById(R.id.I1task);
        i2task = findViewById(R.id.I2task);
        i3task = findViewById(R.id.I3task);
        i4task = findViewById(R.id.I4task);
        a1task = findViewById(R.id.A1task);
        a2task = findViewById(R.id.A2task);


        i1task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activity_I1_Jaimin.class);
                startActivity(intent);
            }
        });

        i2task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activity_I2_Jaimin.class);
                startActivity(intent);
            }
        });

        i3task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activity_I3_Jaimin.class);
                startActivity(intent);
            }
        });

        i4task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activity_I4_Jaimin.class);
                startActivity(intent);
            }
        });

        a1task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activity_A1_Jaimin.class);
                startActivity(intent);
            }
        });

        a2task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activity_A2_Jaimin.class);
                startActivity(intent);
            }
        });
    }
}