package james.my.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_A2_Jaimin extends AppCompatActivity {

    EditText firstvalue,secondvalue;
    Button addition,subtraction,multiply,divison;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__a2__jaimin);

        firstvalue = findViewById(R.id.firstvalue);
        secondvalue = findViewById(R.id.secondvalue);
        addition  = findViewById(R.id.addition);
        subtraction = findViewById(R.id.subtraction);
        multiply = findViewById(R.id.multiplied);
        divison = findViewById(R.id.divison);
        result = findViewById(R.id.reult);

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float first = Float.parseFloat(firstvalue.getText().toString());
                float second  = Float.parseFloat(secondvalue.getText().toString());
                String resultdata = String.valueOf(first + second);

                result.setText(resultdata);
            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float first = Float.parseFloat(firstvalue.getText().toString());
                float second  = Float.parseFloat(secondvalue.getText().toString());
                String resultdata = String.valueOf(first - second);

                result.setText(resultdata);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float first = Float.parseFloat(firstvalue.getText().toString());
                float second  = Float.parseFloat(secondvalue.getText().toString());
                String resultdata = String.valueOf(first * second);

                result.setText(resultdata);
            }
        });

        divison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float first = Float.parseFloat(firstvalue.getText().toString());
                float second  = Float.parseFloat(secondvalue.getText().toString());
                String resultdata = String.valueOf(first / second);

                result.setText(resultdata);
            }
        });
    }
}